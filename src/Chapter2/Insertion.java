/**
 * ֱ�Ӳ�������
 *     ��õ����û���ƶ���¼��ʱ�临�Ӷ�ΪO(n)
 *     ������Ϊ�����ƶ������ﵽ���ֵ
 *     ֱ�Ӳ��������ð������ͼ�ѡ����������Ҫ��һЩ��
 */
package Chapter2;

public class Insertion {
	// ֱ�Ӳ�������1
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
	// ֱ�Ӳ�������2
	public static void insertSort(int[] a){
		int n = a.length;
		for(int i = 1; i < n; i++){
			for(int j = i; j > 0 && a[j - 1] > a[j]; j--){
				a[j - 1] = (a[j - 1] + a[j]) - (a[j] = a[j - 1]);
			}
		}
	}
	// ֱ�Ӳ�������3
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
