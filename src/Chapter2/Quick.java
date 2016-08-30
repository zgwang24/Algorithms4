/**
 * 快速排序：
 * 	   20世纪十大算法之一
 */
package Chapter2;

public class Quick {
	// 快速排序1
	public static void sort(int[] a){
		sort(a, 0, a.length - 1);
	}
	private static void sort(int[] a, int lo, int hi){
		if(hi <= lo){
			return ;
		}
		int j = partition(a, lo, hi);
		sort(a, lo, j - 1);
		sort(a, j + 1, hi);
	}
	private static int partition(int[] a, int lo, int hi){
		int i = lo;
		int j = hi + 1;
		int v = a[lo]; // 切分元素
		while(true){
			while(a[++i] < v){
				if(i == hi){
					break;
				}
			}
			while(v < a[--j]){
				if(j == lo){
					break;
				}
			}
			if(i >= j){
				break;
			}
			a[i] = (a[i] + a[j]) - (a[j] = a[i]);
		}
		a[lo] = (a[lo] + a[j]) - (a[j] = a[lo]);
		return j;
	}
	// 快速排序2
	public static void quickSort(int[] a){
		quickSort2(a, 0, a.length - 1);
	}
	private static void quickSort2(int[] a, int lo, int hi){
		if(hi <= lo){
			return ;
		}
		int mid = part(a, lo, hi);
		quickSort2(a, lo, mid - 1);
		quickSort2(a, mid + 1, hi);
	}
	private static int part(int[] a, int lo, int hi){
		int i = lo;
		int j = hi + 1;
		int v = a[lo];
		while(true){
			while(a[++i] < v){
				if(i == hi){
					break;
				}
			}
			while(a[--j] > v){
				if(j == lo){
					break;
				}
			}
			if(i >= j){
				break;
			}
			a[i] = (a[i] + a[j]) - (a[j] = a[i]);
		}
		a[lo] = (a[lo] + a[j]) - (a[j] = a[lo]);
		return j;
	}
	public static void main(String[] args){
		int[] arr = {10, 7, 9, 40, 2, 5, 100};
		quickSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i] + " ");
		}
	}
}
