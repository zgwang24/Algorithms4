/**
 * 归并排序：
 *     归并排序是一种比较占用内存，但却效率高且稳定的算法。
 *     时间复杂度为O(n*logn)，空间复杂度为O(n + logn)。
 */
package Chapter2;

public class Merge {
	private static int[] aux;
	private static int[] aux1;
	// 归并排序1
	private static void merge(int[] a, int lo, int mid, int hi){
		int i = lo;
		int j = mid + 1;
		for(int k = lo; k <= hi; k++){
			aux[k] = a[k];
		}
		for(int k = lo; k <= hi; k++){
			if(i > mid){
				a[k] = aux[j++];
			}else if(j > hi){
				a[k] = aux[i++];
			}else if(aux[j] < aux[i]){
				a[k] = aux[j++];
			}else{
				a[k] = aux[i++];
			}
		}
	}
	public static void sort(int[] a){
		aux = new int[a.length];
		sort(a, 0, a.length -1);
	}
	private static void sort(int[] a, int lo, int hi){
		if(hi <= lo){
			return ;
		}
		int mid = lo + (hi - lo) / 2;
		sort(a, lo, mid);
		sort(a, mid + 1, hi);
		merge(a, lo, mid, hi);
	}
	// 归并排序2
	public static void mergeSort(int[] a){
		int n = a.length - 1;
		aux1 = new int[a.length];
		mergeSort1(a, 0, n);
	}
	private static void mergeSort1(int[] a, int lo, int hi){
		if(hi <= lo){
			return ;
		}
		int mid = lo + (hi - lo) / 2;
		mergeSort1(a, lo, mid);
		mergeSort1(a, mid + 1, hi);
		merge1(a, lo, mid, hi);
	}
	private static void merge1(int[] a, int lo, int mid, int hi){
		int i = lo;
		int j = mid + 1;
		for(int k = lo; k <= hi; k++){
			aux1[k] = a[k];
		}
		for(int k = lo; k <= hi; k++){
			if(i > mid){
				a[k] = aux1[j++];
			}else if(j > hi){
				a[k] = aux1[i++];
			}else if(aux1[i] < aux1[j]){
				a[k] = aux1[i++];
			}else{
				a[k] = aux1[j++];
			}
		}	
	}
	public static void main(String[] args){
		int[] arr = {10, 7, 9, 40, 2, 5, 100};
		mergeSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i] + " ");
		}
	}
}
