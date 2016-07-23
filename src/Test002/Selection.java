package Test002;

public class Selection {
	public static int[] sort(int[] a){
		int n = a.length;
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				if(a[j] < a[i]){
					a[i] = (a[j] + a[i]) - (a[j] = a[i]);
				}
			}
		}
		return a;
	}
	public static void main(String[] args){
		int[] arr = {10, 89, 90, 2, 78, 32, 65};
		int[] res = sort(arr);
		for(int i = 0; i < res.length; i++){
			System.out.print(res[i] + " ");
		}
		
	}
}
