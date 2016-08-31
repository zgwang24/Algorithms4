package Chapter2;

public class Quick3way {
	public static void quickSort3(int[] a){
		sort(a, 0, a.length - 1);
	}
	private static void sort(int[] a, int lo, int hi){
		if(hi <= lo){
			return ;
		}
		int lt = lo;
		int gt = hi;
		int i = lt + 1;
		int v= a[lo];
		while(i <= gt){
			if(a[i] < v){
				a[i] = a[i] + a[lt] - (a[lt] = a[i]);
				i++;
				lt++;
			}else if(a[i] > v){
				a[i] = a[i] + a[gt] - (a[gt] = a[i]);
				gt--;
			}else{
				i++;
			}
		}
		sort(a, lo, lt - 1);
		sort(a, gt + 1, hi);
	}
	public static void main(String[] args){
		int[] a = {10, 5, 3, 4, 199, 0, 4, 3, 23};
		quickSort3(a);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}
