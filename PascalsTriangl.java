package LogicalCode;

import java.util.Scanner;

public class PascalsTriangl {
	  public static void generatePascalTriangle(int rows) {
	        int[][] triangle = new int[rows][];
	        
	        for (int i = 0; i < rows; i++) {
	            triangle[i] = new int[i + 1]; // each row has i+1 elements
	            triangle[i][0] = triangle[i][i] = 1; // first and last element = 1

	            for (int j = 1; j < i; j++) {
	                // Sum of the two elements directly above
	                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
	            }
	        }

	        // Print all elements in one line
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < triangle[i].length; j++) {
	                System.out.print(triangle[i][j] + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        generatePascalTriangle(rows);
	    }
}
