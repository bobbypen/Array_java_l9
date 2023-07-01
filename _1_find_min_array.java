package lecture9;
import java.util.Scanner;
public class _1_find_min_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//taking from user inputs in array 
		int n = sc.nextInt();
		int [] arr = new int[n];  //no. of element declare by n input
		
		//loop for taking input on pArticular indexs from 0
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); 
		}
		System.out.println(minArray(arr)); // used for int
//		minArray1(arr);  // this used for void
	}
		
		public static int minArray(int[] arr) {
			
			int min = arr[0];
			for (int i = 0; i < arr.length; i++) {
				
				if(arr[i]<min) {
					min = arr[i];
				}
				
			}
			return min;
			
			
		
		
			}

//public static void minArray1(int[] arr) {
//			
//			int min = arr[0];
//			for (int i = 0; i < arr.length; i++) {
//				
//				if(arr[i]<min) {
//					min = arr[i];
//				}
//				
//			}
//			System.out.println(min);
//			
//			
//		
//		
//			}

	

}
