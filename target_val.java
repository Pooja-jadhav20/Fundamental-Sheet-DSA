package Array_Strings;

public class target_val {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int target=5;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+" "+ arr[j]);
				}
			}
		}

	}

}
