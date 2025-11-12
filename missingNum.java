package LogicalCode;

public class missingNum {

	public static void main(String[] args) {
		int[] arr= {1,2,3,5,7};
		int expected=1;
		for(int i=0;i<arr.length;i++) {
			while(arr[i]!=expected) {
				System.out.println("the missing number is: "+expected);
				expected++;
			}
			expected++;
		}
	}

}
