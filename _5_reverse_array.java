package lecture9;
import java.util.Scanner;
public class _5_reverse_array {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = {0,10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
		
		//To Print current array
		System.out.println("Your Current Array:- ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println();
		
		System.out.println("Enter Your Starting Index:-");
		int i = sc.nextInt();
		System.out.println("Enter Your Ending Index:-");
		int j = sc.nextInt();
		
		reverse_array(arr,i,j);
		
		
		System.out.println("Here is Your Output");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + "\t");
		}
			
	}
	
	
	
	
	public static void reverse_array(int [] arr,int i,int j) {
//		Scanner sc = new Scanner(System.in);
		
		//value already taken in function as parameter
	
		
		while(i<j) {
			int temp = arr[i];
			arr [i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		
		
	}

}
