package Test002;
/**
 * ��δ����
 * */
public class Merge {
	private static int[] aux;
	public static void merge(int[] a, int lo, int mid, int hi){
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
	public static void main(String[] args){
		int[] arr = {10, 7, 9, 40, 2, 5, 100};
		sort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i] + " ");
		}
	}
}
