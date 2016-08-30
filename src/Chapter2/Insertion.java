/**
 * 直接插入排序：
 *     最好的情况没有移动记录，时间复杂度为O(n)
 *     最坏的情况为逆序，移动次数达到最大值
 *     直接插入排序比冒泡排序和简单选择排序性能要好一些。
 */
package Chapter2;

public class Insertion {
	// 直接插入排序1
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
	// 直接插入排序2
	public static void insertSort(int[] a){
		int n = a.length;
		for(int i = 1; i < n; i++){
			for(int j = i; j > 0 && a[j - 1] > a[j]; j--){
				a[j - 1] = (a[j - 1] + a[j]) - (a[j] = a[j - 1]);
			}
		}
	}
	// 直接插入排序3
	public static void straightInsertionSort(int[] a){
		for(int i = 1; i < a.length; i++){
			for(int j = i; j > 0 && a[j - 1] > a[j]; j--){
				a[j - 1] = a[j - 1] + a[j] - (a[j] = a[j - 1]);
			}
		}
	} 
	public static void main(String[] args){
		int[] arr = {10, 89, 90, 2, 78, 32, 65, 10};
		// int[] res = sort(arr);
		// insertSort(arr);
		straightInsertionSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
