package LogicalCode;

public class DigitSquareSum {
	 public static int sumOfSquares(int number) {
	        int sum = 0;

	        // Handle negative input by converting it to positive
	        number = Math.abs(number);

	        while (number > 0) {
	            int digit = number % 10;       // Get the last digit
	            sum += digit * digit;          // Square it and add to sum
	            number /= 10;                  // Remove the last digit
	        }

	        return sum;
	    }

	    // Main method to test the function
	    public static void main(String[] args) {
	        // Test cases
	        int number1 = 123;
	        int number2 = 22;
	        int number3 = 99;

	        System.out.println("Input: " + number1 + " → Output: " + sumOfSquares(number1)); // 14
	        System.out.println("Input: " + number2 + " → Output: " + sumOfSquares(number2)); // 0
	        System.out.println("Input: " + number3 + " → Output: " + sumOfSquares(number3)); // 162
	    }
}
