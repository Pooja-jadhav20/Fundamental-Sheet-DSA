package LogicalCode;

public class ArmstrongNumbers1to500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 1; i <= 500; i++) {
	            int num = i;
	            int sum = 0;
	            int length = String.valueOf(num).length();
                int original=num;
	            while (num != 0) {
	                int digit = num % 10;
	                sum += Math.pow(digit, length);
	                num /= 10;
	            }

	            if (sum == original) {
	                System.out.println("The Armstrong number is: " + i);
	            }
	        }
		 
	}

}


