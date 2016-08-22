package Chapter1;

import java.util.Scanner;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {

	private static Scanner sc;

	public static void main(String[] args) {
		// define two stacks
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		sc = new Scanner(System.in);
		while(sc.hasNext() && !sc.equals(" ")){
			String s = sc.next();
			if(s.equals("(")){
				
			}else if(s.equals("+")){
				ops.push(s);
			}else if(s.equals("-")){
				ops.push(s);
			}else if(s.equals("*")){
				ops.push(s);
			}else if(s.equals("/")){
				ops.push(s);
			}else if(s.equals("sqrt")){
				ops.push(s);
			}else if(s.equals(")")){
				String op = ops.pop();
				double val = vals.pop();
				if(op.equals("+")){
					val = vals.pop() + val;
				}else if(op.equals("-")){
					val = vals.pop() - val;
				}else if(op.equals("*")){
					val = vals.pop() * val;
				}else if(op.equals("/")){
					val = vals.pop() / val;
				}else if(op.equals("sqrt")){
					val = Math.sqrt(val);
				}
				vals.push(val);
			}else{
				vals.push(Double.parseDouble(s));
			}
		}
		System.out.println(vals.pop());
	}
}
