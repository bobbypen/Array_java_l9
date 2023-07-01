package lecture9;

public class _2_find_max_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,50,41,052,045,0114,11,1,9999};
		System.out.println(maxArray(arr));
	}
	
		public static int maxArray(int [] arr) {
			int max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]>max) {
					max = arr[i];
				}
				
			}
			return max;
}

}
