package wxpay;

public class Array {
	public static void main(String[] arges){
		int[] array = {1,4,5,6,9,0,3,2};
		for(int i = 0;i<array.length-1;i++){
			for(int k = i; k<array.length-i-1;k++){
				int temp = k;
				if(array[k] > array[k+1]){
					array[k] = array[k+1];
					
				}
			}
		}
	System.out.pring('aa');
	}
}
