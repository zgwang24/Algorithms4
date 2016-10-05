package Chapter5;

import edu.princeton.cs.algs4.BinaryStdIn;

public class BinaryDump {
	public static void main(String[] args) {
		int width = Integer.parseInt("24");
		int cnt;
		for(cnt = 0; !BinaryStdIn.isEmpty(); cnt++){
			if(width == 0){
				continue;
			}
			if(cnt != 0 && cnt % width == 0){
				System.out.println();
			}
			if(BinaryStdIn.readBoolean()){
				System.out.println("1");
			}else{
				System.out.println("0");
			}
		}
		System.out.println();
		System.out.println(cnt + " bits");
	}
}
