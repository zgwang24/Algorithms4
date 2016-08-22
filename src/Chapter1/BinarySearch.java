/**
 * 二分查找（数组必须是有序的）
 * @author zgwang
 */
package Chapter1;

public class BinarySearch {
	public static int rank(int key, int[] a){
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if(key < a[mid]){
				hi = mid - 1;
			}else if(key > a[mid]){
				lo = mid + 1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int a[] = {1, 3 ,5 , 7, 11, 56, 78};
		int key = 5;
		int res = rank(key, a);
		System.out.println(res);
	}
}
