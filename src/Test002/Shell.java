package Test002;

public class Shell {
	public static int[] sort(int[] a){
		int n = a.length;
		int p = 1;
		while(p < n/3){
			p = p * 3 + 1;
		}
		while(p >= 1){
			for(int i = p; i < n; i++){
				for(int j = i; j >= p; j-=p){
					if(a[j] < a[j -p]){
						a[j] = (a[j] + a[j - p]) - (a[j - p] = a[j]);
					}
				}				
			}
			p = p / 3;
		}
		return a;
	}
	public static void main(String[] args){
		int[] arr = {10, 54, 1, 89, 90, 2, 78, 32, 65};
		int[] res = sort(arr);
		for(int i = 0; i < res.length; i++){
			System.out.print(res[i] + " ");
		}
	}
}
