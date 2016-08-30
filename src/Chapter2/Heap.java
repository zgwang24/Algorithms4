/**
 * 堆排序：将待排序的序列构成一个大顶堆。此时，整个序列的最大值就是堆顶的根节点。
 *     将它移走，然后将剩下的n-1个序列重新构造一个堆，这样就会得到一个n个元素中的次大值。
 *     如此反复执行，便能够得到一个有序序列。
 *     时间复杂度为O(n*logn)，无论最好、最坏和平均情况都一样。但是为一种不稳定的排序。
 *     不适合待排序序列个数较少的情况。
 */
package Chapter2;

public class Heap {
	// 堆排序1
	public static void sort(int[] a){
		int N = a.length;
		// 构建堆
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
	// 堆排序2
	public static void heapSort(int[] a){
		for(int i = a.length / 2; i >= 0; i--){
			down(a, i, a.length);
		}
		for(int j = a.length - 1; j > 0; j--){
			a[0] = (a[0] + a[j]) - (a[j] = a[0]);
			down(a, 0, j);
		}
	}
	private static void down(int[] a, int i, int j){
		int child;
		while(2 * i + 1 < j){
			child = 2 * i + 1;
			if(child != j -1 && a[child] < a[child + 1]){
				child++;
			}
			if(a[i] < a[child]){
				a[i] = (a[i] + a[child]) - (a[child] = a[i]);
			}else{
				break;
			}
			i = child;
		}
	}
	public static void main(String[] args){
		int[] a = new int[5];
		a[1] = 10;
		a[2] = 3;
		a[3] = 5;
		a[4] = 4;
		heapSort(a);
		for(int i = 1; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}
