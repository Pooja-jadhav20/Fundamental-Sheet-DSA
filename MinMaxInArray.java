package LogicalCode;

public class MinMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4, 7, 1, 8, 5,10,50,0};

		int max=arr[0];
		int min=arr[0];
		
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("the max value is : "+ max + "  the min value is :" + min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//		
//		int high=arr[0];
//		int low =arr[0];
//		for(int i=1; i<arr.length;i++) {
//			if(arr[i]>high) {
//				high=arr[i];
//			}
//			if(arr[i]<low) {
//				low=arr[i];
//			}
//		}
//		System.out.println("highest num is : "+high +"  low value is: " +low);
	}

}
