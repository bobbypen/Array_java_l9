package lecture9;

import java.util.Iterator;

public class _6_rotate_Array {
//	public class ReverSal_ALgo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
			int k = 2;
			
			rotate(arr,k);
			
			
			//remeber this loop for print array 
			
			
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}

		}
		
		public static void rotate(int[] arr,int k) {
			
			
			k = k % arr.length;
			for (int j = 1; j <= k; j++) {
				
			//nested loop 
				
			int temp = arr[arr.length-1];
			
			for (int i = arr.length-2; i >=0 ; i--) {
					arr[i+1] = arr[i];
			}
			
			arr[0] =temp;
		}
			//---------------------------
			
		}
		
		
		
		
		
	}