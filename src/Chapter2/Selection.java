package Chapter2;

public class Selection {
	public static void sort(int[] a){
		int n = a.length;
		for(int i = 0; i < n; i++){
			int min = i;
			for(int j = i + 1; j < n; j++){
				if(a[j] < a[min]){
					min = j;
				}
			}
			a[i] = (a[i] + a[min]) - (a[min] = a[i]);
		}
	}
	
	public static void main(String[] args){
		int[] arr = {10, 89, 90, 2, 78, 32, 65};
		sort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
	}
}
