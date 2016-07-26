package Test002;

public class MaxPQ {
	private int[] pq;
	private int N = 0;
	
	public MaxPQ(int maxN){
		pq = new int[maxN];
	}
	public boolean isEmpty(){
		return N == 0;
	}
	public int size(){
		return N;
	}
	public void insert(int v){
		pq[++N] = v;
		swim(N, pq);
	}
	public int delMax(){
		int max = pq[1];
		pq[1] = (pq[N] + pq[1]) - (pq[N] = pq[1]);
		N--;
		sink(1, N, pq);
		return max;
	}
	public int[] getPQ(){
		return pq;
	}
	private void swim(int k, int[] a){
		while(k > 1 && a[k/2] < a[k]){
			a[k/2] = (a[k/2] + a[k]) - (a[k] = a[k/2]);
			k = k/2;
		}
	}
	public void sink(int k, int N, int[] a){
		while(2*k < N){
			int j = 2*k;
			if(j < N && a[j] < a[j + 1]){
				j++;
			}
			if(a[k] > a[j]) break;
			a[k] = (a[k] + a[j]) - (a[j] = a[k]);
			k = j;
		}
	}
	public static void main(String[] args){
		MaxPQ pq = new MaxPQ(10);
		pq.insert(2);
		pq.insert(3);
		pq.insert(4);
		pq.insert(1);
		pq.insert(5);
		pq.insert(6);
		pq.insert(0);
		int[] data = pq.getPQ();
		for(int i = 0; i < data.length - 1; i++){
			System.out.println(data[i+1]);
		}
	}
}
