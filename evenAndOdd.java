package LogicalCode;

import java.util.Scanner;

public class evenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number u want to chek");
        int num=sc.nextInt();
        if(num%2==0) {
        	System.out.println("this is the even number:" +num);
        }else {
        	System.out.println("this is odd number:"+num);
        }		
	}

}
