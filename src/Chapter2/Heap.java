/**
 * �����򣺽�����������й���һ���󶥶ѡ���ʱ���������е����ֵ���ǶѶ��ĸ��ڵ㡣
 *     �������ߣ�Ȼ��ʣ�µ�n-1���������¹���һ���ѣ������ͻ�õ�һ��n��Ԫ���еĴδ�ֵ��
 *     ��˷���ִ�У����ܹ��õ�һ���������С�
 *     ʱ�临�Ӷ�ΪO(n*logn)��������á����ƽ�������һ��������Ϊһ�ֲ��ȶ�������
 *     ���ʺϴ��������и������ٵ������
 */
package Chapter2;

public class Heap {
	// ������1
	public static void sort(int[] a){
		int N = a.length;
		// ������
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
	// ������2
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
