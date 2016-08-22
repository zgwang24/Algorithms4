package Chapter3;

import java.util.HashMap;
import java.util.Scanner;

public class KeyValue {
	
	public static void main(String[] args){
		HashMap<String, Integer> st = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(sc.hasNext()){
			st.put(sc.nextLine(), i++);
		}
		
		for(String s : st.keySet()){
			System.out.println(s + "  " + st.get(s));
		}
	}
}
