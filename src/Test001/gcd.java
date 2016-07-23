/**
 * 欧几里得（最大公约数）
 * @author zgwang
 *
 */
package Test001;
class gcd{
	public static void main(String[] args){
		
	}
	public static int gcd(int p, int q){
		if(q == 0){
			return p;
		}
		int r = p % q;
		return gcd(q, r);
	}
}
