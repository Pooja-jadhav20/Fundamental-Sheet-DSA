package LogicalCode;


import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {12, 20, 30, 54, 15, 9, 10};
	        Arrays.sort(arr); // Sorts in ascending order
	        
	        // Second largest is at index arr.length - 2
	        System.out.println("Second largest number: " + arr[arr.length - 2]);

	        System.out.println("Sorted array: " + Arrays.toString(arr));
	       
	    }

}
