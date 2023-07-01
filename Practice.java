package lecture9;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = {10,20,30,4,50,60,70};
		
		int item = sc.nextInt();
		
		System.out.println(search(arr,item));
		
		
		
	
		
		
	}
	
	public static int search(int [] arr,int item) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == item) {
				return i;
			}
			
		}
		return -1;
	}

}
