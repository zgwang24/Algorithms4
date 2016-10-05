/**
 * �ַ���������������������λ���ȣ�Least-Significant-Digit First��LSD������λ���ȣ�MSD��
 * �������������裺
 * 1.Ƶ��ͳ��
 * 2.��Ƶ��ת��Ϊ����
 * 3.���ݷ���
 * 4.��д
 */
package Chapter5;

public class StringSort {
	public static void countKeyIndex(String[] a){
		int N = a.length;
		String[] aux = new String[N];
		int[] count = new int[6];
		
		// �������Ƶ��
		for(int i = 0; i < N; i++){
			count[Integer.parseInt(a[i].substring(a[i].length() - 1)) + 1]++;
		}
		// ��Ƶ��ת��Ϊ��ʼ����
		for(int r = 0; r < 5; r++){
			count[r + 1] += count[r];
		}
		// ��Ԫ�ط���
		for(int j = 0; j < N; j++){
			aux[count[Integer.parseInt(a[j].substring(a[j].length() - 1))]++] = a[j];
		}
		// ��д
		for(int k = 0; k < N; k++){
			a[k] = aux[k];
		}
	}
	public static void main(String[] args){
		String[] str = {"Anderson2", "Brown3", "Davies3", "Garcia4", "Harris1"};
		countKeyIndex(str);
		for(int i = 0; i < str.length; i ++){
			System.err.println(str[i]);
		}
	}
}
