package Test002;

public class Heap {
	public static void sort(int[] a){
		int N = a.length;
		// ¹¹½¨¶Ñ
		for(int k = N / 2; k >= 1; k--){
			sink(a, k, N);
		}
		while(N > 1){
			int val = a[--N];
			a[1] = (a[1] + val) - (val = a[1]);
			sink(a, 1, N);
		}
	}
	private static void sink(int[] a, int k, int N){
		while(2*k <= N){
			int j = 2*k;
			if(((j + 1) < N) && (a[j] < a[j + 1])){
				j++;
			}
			if(a[k] >= a[j]){
				break;
			}
			a[k] = (a[k] + a[j]) - (a[j] = a[k]);
			k = j;
		}
	}
	public static void main(String[] args){
		int[] a = new int[5];
		a[1] = 10;
		a[2] = 3;
		a[3] = 5;
		a[4] = 4;
		sort(a);
		for(int i = 1; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}
