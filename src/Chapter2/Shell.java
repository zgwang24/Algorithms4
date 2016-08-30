/**
 * ϣ������
 *     �ֳ�������������������ѡȡʮ�ֹؼ�
 *     ����ͻ��O(n*n)���㷨
 *     ���һ������ֵ����Ϊ1
 */
package Chapter2;

public class Shell {
	// ϣ������1
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
	// ϣ������2
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
