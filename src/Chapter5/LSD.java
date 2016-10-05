package Chapter5;

public class LSD {
	// ��λ���������㷨1
	public static void sort(String[] a, int w){
		int n = a.length;
		int R = 256;
		String[] aux = new String[n];
		for(int d = w - 1; d >= 0; d--){
			int[] count = new int[R + 1];
			// ͳ�ƴ�Ƶ
			for(int i = 0; i < n; i++){
				count[a[i].charAt(d) + 1]++;
			}
			// Ƶ��תΪ����
			for(int r = 0; r < R; r++){
				count[r+1] += count[r];
			}
			// ��Ԫ�ط���
			for(int i = 0; i < n; i++){
				aux[count[a[i].charAt(d)]++] = a[i];
			}
			// ��д
			for(int i = 0; i < n; i ++){
				a[i] = aux[i];
			}
		}
	}
	// ��λ���������㷨2������1���ַ������飬����2��ÿ���ַ����ȳ�w��
	public static void lsdSort(String[] a, int w){
		int n = a.length;
		String[] aux = new String[n];
		int R = 256;
		for(int i = w - 1; i >= 5; i--){
			int[] count = new int[R + 1];
			// ͳ��Ƶ��
			for(int j = 0; j < n; j++){
				count[a[j].charAt(i) + 1]++;
			}
			// ������ʼ����
			for(int j = 0; j < R; j++){
				count[j + 1] += count[j];
			}
			// ���ݷ���
			for(int j = 0; j < n; j++){
				aux[count[a[j].charAt(i)]++] = a[j];
			}
			// ��д
			for(int j = 0; j < n; j ++){
				a[j] = aux[j];
			}
		}
	}
	public static void main(String[] args){
		String[] a = {"4PGC938", "2IYE230", "3CIO720", 
				"1ICK750", "1OHV845", "4JZY524", "1ICK750", 
				"3CIO720", "1OHV845", "1OHV845", "2RLA629",
				"2RLA629", "3ATW723"};
		// sort(a, 7);
		lsdSort(a, 7);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}
