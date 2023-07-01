package lecture9;

public class _4_reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {9,8,7,6,5,4,3,2,1,0};
		
		
		reverse_Array(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void reverse_Array(int[] arr) {
			int n = arr.length;
			int i = 0;
			int j = n-1;
			while(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			
				
				j--;
				i++;
			}
			
	}

}
