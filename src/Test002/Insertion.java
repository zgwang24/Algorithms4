package Test002;

public class Insertion {
	public static int[] sort(int[] a){
		int n = a.length;
		for(int i = 1; i < n; i++){
			for(int j = i; j > 0; j--){
				if(a[j] < a[j - 1]){
					a[j] = (a[j] + a[j - 1]) - (a[j - 1] = a[j]);
				}
			}
		}
		return a;
	}
	public static void main(String[] args){
		int[] arr = {10, 89, 90, 2, 78, 32, 65, 10};
		int[] res = sort(arr);
		for(int i = 0; i < res.length; i++){
			System.out.print(res[i] + " ");
		}
	}
}
