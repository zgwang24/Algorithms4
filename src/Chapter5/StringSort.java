/**
 * 字符串排序：索引计数法；低位优先（Least-Significant-Digit First，LSD）；高位优先（MSD）
 * 索引计数法步骤：
 * 1.频率统计
 * 2.将频率转化为索引
 * 3.数据分类
 * 4.回写
 */
package Chapter5;

public class StringSort {
	public static void countKeyIndex(String[] a){
		int N = a.length;
		String[] aux = new String[N];
		int[] count = new int[6];
		
		// 计算出现频率
		for(int i = 0; i < N; i++){
			count[Integer.parseInt(a[i].substring(a[i].length() - 1)) + 1]++;
		}
		// 将频率转化为起始索引
		for(int r = 0; r < 5; r++){
			count[r + 1] += count[r];
		}
		// 将元素分类
		for(int j = 0; j < N; j++){
			aux[count[Integer.parseInt(a[j].substring(a[j].length() - 1))]++] = a[j];
		}
		// 回写
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
