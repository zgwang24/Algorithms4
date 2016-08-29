package Chapter2;

public class Bubble {	
    public static void sort(int[] a){
        int temp = 0;
        for (int i = a.length - 1; i > 0; --i){
            for (int j = 0; j < i; ++j){
                if (a[j + 1] < a[j]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
    	int[] a = {1, 3, 4, 2, 10};
    	sort(a);
    	for(int i = 0; i < a.length; i++){
    		System.out.println(a[i]);
    	}
    }
}
