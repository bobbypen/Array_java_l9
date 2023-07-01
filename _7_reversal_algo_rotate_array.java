package lecture9;

public class _7_reversal_algo_rotate_array {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(arr, k);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		
}
	
	public static void rotate(int [] arr, int k) {
		k= k%arr.length;
		int n = arr.length;
		
		//for first line
		
		reverse(arr,0,n-k-1);
		
		//last line
		
		reverse(arr, n-k, n-1);
		
		//all line
		
		reverse(arr,0,n-1);
		
		
	}
	
	public static void reverse (int [] arr ,int i ,int j) {
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}