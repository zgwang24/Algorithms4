package Chapter5;

public class LSD {
	// 低位优先排序算法1
	public static void sort(String[] a, int w){
		int n = a.length;
		int R = 256;
		String[] aux = new String[n];
		for(int d = w - 1; d >= 0; d--){
			int[] count = new int[R + 1];
			// 统计词频
			for(int i = 0; i < n; i++){
				count[a[i].charAt(d) + 1]++;
			}
			// 频率转为索引
			for(int r = 0; r < R; r++){
				count[r+1] += count[r];
			}
			// 将元素分类
			for(int i = 0; i < n; i++){
				aux[count[a[i].charAt(d)]++] = a[i];
			}
			// 回写
			for(int i = 0; i < n; i ++){
				a[i] = aux[i];
			}
		}
	}
	// 低位优先排序算法2（参数1：字符串数组，参数2：每个字符串等长w）
	public static void lsdSort(String[] a, int w){
		int n = a.length;
		String[] aux = new String[n];
		int R = 256;
		for(int i = w - 1; i >= 5; i--){
			int[] count = new int[R + 1];
			// 统计频率
			for(int j = 0; j < n; j++){
				count[a[j].charAt(i) + 1]++;
			}
			// 计算起始索引
			for(int j = 0; j < R; j++){
				count[j + 1] += count[j];
			}
			// 数据分类
			for(int j = 0; j < n; j++){
				aux[count[a[j].charAt(i)]++] = a[j];
			}
			// 回写
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
