package Test002;

public class Quick {
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
		int v = a[lo]; // ÇÐ·ÖÔªËØ
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
	public static void main(String[] args){
		int[] arr = {10, 7, 9, 40, 2, 5, 100};
		sort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i] + " ");
		}
	}
}
