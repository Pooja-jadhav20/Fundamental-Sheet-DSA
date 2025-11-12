package LogicalCode;

public class SummingDigitsofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if i have numbers then i do like that 
		//int sum=0;
		
//		for(int i=1;i<=4;i++) {
//			sum+=i;
//		}
//            System.out.println("the total num for 4 is : " +sum);
//	}
		  int[] arr = {1, 2, 3, 4, 5};
	        int sum = 0;

	        // Sum of the first 4 elements (index 0 to 3)
	        for (int i = 0; i < 4; i++) {
	            sum += arr[i];
	        }

	        System.out.println("The total sum of first 4 elements is: " + sum);
	    }
	}


