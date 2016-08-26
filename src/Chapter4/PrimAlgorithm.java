/**
 * ����ķ�㷨
 */
package Chapter4;

public class PrimAlgorithm {
	static int MAX = 65535;
	// ����ķ
	public static void prim(int[][] graph, int n){
		int min, k = 0, sum = 0;
		// ������ض�����±�
		int[] adjvex = new int[n];
		// ������ض����ߵ�Ȩֵ
		int[] lowcost = new int[n];
		// ��ʼ����һ��ȨֵΪ0����v0������С���������������б�����Ϊ0�ͱ�ʾ���±�Ķ��㱻������С��������
		lowcost[0] = 0;
		
		// ѭ�����±�0���ȫ���ڵ�
		for(int i = 1; i < n; i++){
			// ��v0��֮�бߵ�Ȩֵ��������
			lowcost[i] = graph[0][i];
			// ��ʼ����Ϊv0���±�
			adjvex[i] = 0;
		}
		for(int i = 1; i < n; i++){
			// ��ʼ����СȨֵΪ������
			min = MAX;
			for(int j = 1; j < n; j++){
				if(lowcost[j] != 0 && lowcost[j] < min){
					// �õ�ǰȨֵ��Ϊ��Сֵ
					min = lowcost[j];
					// ��ǰ��Сֵ���±����k
					k = j;
				}
			}
			System.out.println("��ǰ�������Ȩֵ��С��" + adjvex[k] + " " + k);
			sum += min;
			// ��ǰ�����Ȩֵ����Ϊ0���˶����Ѿ��������
			lowcost[k] = 0;
			for(int j = 1; j < n; j++){
				if(lowcost[j] != 0 && graph[k][j] < lowcost[j]){
					// ���±�Ϊk�������ȨֵС�ڴ�ǰ��Щ����δ������������Ȩֵ
					// ����СȨֵ����lowcost
					lowcost[j] = graph[k][j];
					// �±�Ϊk�Ķ������adjvex
					adjvex[j] = k;
				}
			}
		}
		System.out.println("���·����Ϊ" + sum);
	}
	public static void main(String[] args){
		int[][] map = new int[][]{
            {0,10,MAX,MAX,MAX,11,MAX,MAX,MAX},
            {10,0,18,MAX,MAX,MAX,16,MAX,12},
            {MAX,MAX,0,22,MAX,MAX,MAX,MAX,8},
            {MAX,MAX,22,0,20,MAX,MAX,16,21},
            {MAX,MAX,MAX,20,0,26,MAX,7,MAX},
            {11,MAX,MAX,MAX,26,0,17,MAX,MAX},
            {MAX,16,MAX,MAX,MAX,17,0,19,MAX},
            {MAX,MAX,MAX,16,7,MAX,19,0,MAX},
            {MAX,12,8,21,MAX,MAX,MAX,MAX,0}
        };
		prim(map, map.length);
	}
}
