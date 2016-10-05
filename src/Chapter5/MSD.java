package Chapter5;

import edu.princeton.cs.algs4.Insertion;

public class MSD {
	// ����
	private static int R = 256;
	// С������л���ֵ
	private static final int M = 15;
	// ��������
	private static String[] aux;
	
	private static int charAt(String s, int d){
		if(d < s.length()){
			return s.charAt(d);
		}else{
			return -1;
		}
	}
	public static void sort(String[] a){
		int n = a.length;
		aux = new String[n];
		sort(a, 0, n - 1, 0);
	} 
	public static void sort(String[] a, int lo, int hi, int d){
		// �Ե�d���ַ�Ϊ����lo��hi����
		if(hi <= lo + M){
			// Insertion.sort(a, lo, hi, d);
			return ;
		}
		// ����Ƶ��
		int[] count = new int[R + 2];
		for(int i = lo; i <= hi; i++){
			count[charAt(a[i], d) + 2]++;
		}
		// ��Ƶ��תΪ����
		for(int r = 0; r < R + 1; r++){
			count[r + 1] += count[r];
		}
		// ���ݷ���
		for(int i = lo; i <= hi; i++){
			aux[count[charAt(a[i], d) + 1]++] = a[i];
		}
		// ��д
		for(int i = lo; i <= hi; i++){
			a[i] = aux[i - lo];
		}
		// �ݹ����ÿ���ַ�Ϊ����������
		for(int r = 0; r < R; r++){
			sort(a, lo + count[r], lo + count[r + 1] - 1, d + 1);
		}
	}
}
