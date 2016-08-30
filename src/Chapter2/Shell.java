/**
 * 希尔排序：
 *     又称增量缩减排序，增量的选取十分关键
 *     首批突破O(n*n)的算法
 *     最后一个增量值必须为1
 */
package Chapter2;

public class Shell {
	// 希尔排序1
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
	// 希尔排序2
	public static void shellSort(int[] a){
		for(int gap = a.length / 2; gap > 0; gap /= 2){
			for(int i = gap; i < a.length; i++){
				for(int j = i; j >= gap && a[j - gap] > a[j]; j -= gap){
					a[j - gap] = (a[j - gap] + a[j]) - (a[j] = a[j - gap]);
				}
			}
		}
	}
	public static void main(String[] args){
		int[] arr = {10, 54, 1, 0, 0, 89, 90, 2, 78, 32, 65};
		// int[] res = sort(arr);
		shellSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
