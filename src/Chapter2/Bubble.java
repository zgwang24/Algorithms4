/**
 * 冒泡排序：思路简单，前后没有关联，效率低。
 */
package Chapter2;

public class Bubble {	
	// 冒泡排序1
    public static void sort(int[] a){
        int temp = 0;
        for (int i = a.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (a[j + 1] < a[j]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    // 冒泡排序2
    public static void bubbleSort(int[] a){
    	for(int i = a.length - 1; i > 0; i--){
    		for(int j = 0; j < i; j++){
    			if(a[j] > a[j + 1]){
    				a[j] = (a[j] + a[j + 1]) - (a[j + 1] = a[j]);
    			}
    		}
    	}
    }
    // 冒泡排序优化
    public static void bubbleUpdate(int[] a){
    	boolean flag = true;
    	for(int i = a.length - 1; i > 0 && flag; i--){
    		flag = false;
    		for(int j = 0; j < i; j++){
    			if(a[j] > a[j + 1]){
    				a[j] = (a[j] + a[j + 1]) - (a[j + 1] = a[j]);
    				flag = true; 
    			}
    		}
    	}
    }
    public static void main(String[] args){
    	int[] a = {1, 3, 4, 2, 10, 5, 3, 7, 9};
    	// sort(a);
    	// bubbleSort(a);
    	bubbleUpdate(a);
    	for(int i = 0; i < a.length; i++){
    		System.out.println(a[i]);
    	}
    }
}
