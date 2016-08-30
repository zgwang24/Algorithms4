/**
 * ��ѡ������
 * �ص㣺�����ƶ������١�
 *     ������������������Ƚϴ�����һ���ࡣ
 *     ����������ð������
 */
package Chapter2;

public class Selection {
	// ��ѡ������1
	public static void sort(int[] a){
		int n = a.length;
		for(int i = 0; i < n; i++){
			int min = i;
			for(int j = i + 1; j < n; j++){
				if(a[j] < a[min]){
					min = j;
				}
			}
			a[i] = (a[i] + a[min]) - (a[min] = a[i]);
		}
	}
	// ��ѡ������2
	public static void simpleSelectionSort(int[] a){
		for(int i = 0; i < a.length; i++){
			int min = i;
			for(int j = i + 1; j < a.length; j++){
				if(a[j] < a[min]){
					min = j;
				}
			}
			a[i] = (a[i] + a[min]) - (a[min] = a[i]);
		}
	}
	public static void main(String[] args){
		int[] arr = {10, 89, 90, 2, 78, 32, 65};
		// sort(arr);
		simpleSelectionSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
	}
}
