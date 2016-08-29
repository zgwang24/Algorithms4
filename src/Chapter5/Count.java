/**
 * Alphabet 实现字符数量统计
 */
package Chapter5;

import java.util.Scanner;

import edu.princeton.cs.algs4.Alphabet;

public class Count {
	private static Scanner sc;

	public static void main(String[] args){
		Alphabet alpha= new Alphabet();	
		int R = alpha.radix();
		int[] count = new int[R];
		
		sc = new Scanner(System.in);
		String s = sc.nextLine();
		int N = s.length();
		
		int[] a = alpha.toIndices(s);
		for(int i = 0; i < N; i++){
			count[a[i]]++;
		}
		
		/*for(int i = 0; i < N; i++){
			if(alpha.contains(s.charAt(i))){
				count[alpha.toIndex(s.charAt(i))]++;
			}
		}*/
		
		for(int j = 0; j < R; j++){
			if(count[j] > 0){
				System.out.println(alpha.toChar(j) + " " + count[j]);
			}
		}
	}
}
