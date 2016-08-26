/**
 * 普里姆算法
 */
package Chapter4;

public class PrimAlgorithm {
	static int MAX = 65535;
	// 普里姆
	public static void prim(int[][] graph, int n){
		int min, k = 0, sum = 0;
		// 保存相关顶点的下标
		int[] adjvex = new int[n];
		// 保存相关顶点间边的权值
		int[] lowcost = new int[n];
		// 初始化第一个权值为0，即v0加入最小生成树。该数组中被设置为0就表示此下标的顶点被纳入最小生成树。
		lowcost[0] = 0;
		
		// 循环除下标0外的全部节点
		for(int i = 1; i < n; i++){
			// 将v0与之有边的权值存入数组
			lowcost[i] = graph[0][i];
			// 初始化都为v0的下标
			adjvex[i] = 0;
		}
		for(int i = 1; i < n; i++){
			// 初始化最小权值为正无穷
			min = MAX;
			for(int j = 1; j < n; j++){
				if(lowcost[j] != 0 && lowcost[j] < min){
					// 让当前权值成为最小值
					min = lowcost[j];
					// 当前最小值得下标存入k
					k = j;
				}
			}
			System.out.println("当前顶点边中权值最小边" + adjvex[k] + " " + k);
			sum += min;
			// 当前顶点的权值设置为0，此顶点已经完成任务
			lowcost[k] = 0;
			for(int j = 1; j < n; j++){
				if(lowcost[j] != 0 && graph[k][j] < lowcost[j]){
					// 若下标为k顶点各边权值小于此前这些顶点未被加入生成树权值
					// 将较小权值存入lowcost
					lowcost[j] = graph[k][j];
					// 下标为k的顶点存入adjvex
					adjvex[j] = k;
				}
			}
		}
		System.out.println("最短路径和为" + sum);
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
