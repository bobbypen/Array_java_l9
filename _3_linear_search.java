package lecture9;
import java.util.Scanner;
public class _3_linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = { 10,20,14,5,0145,364,22541,23642};
		System.out.println("Enter the Number: - ");
		int item = sc.nextInt();
		
		System.out.println(linear_search(arr,item));
	}

	
	public static int linear_search(int[] arr , int item) {
		for (int i = 0; i < arr.length; i++) {
			if(item == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
