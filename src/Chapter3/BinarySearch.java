/**
 * ¶ş·Ö²éÕÒ
 * 
 */
package Chapter3;

public class BinarySearch {
	public static int binarySearch(int[] arr, int val){
		int lo = 0;
		int hi = arr.length - 1;
		while(lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if(arr[mid] < val){
				lo = mid + 1;
			}else if(arr[mid] > val){
				hi = mid - 1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr = {1, 3, 4, 7, 9, 10};
		int val = 10;
		System.out.println(binarySearch(arr, val));
	}
}
