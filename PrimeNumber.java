package LogicalCode;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner  sc = new Scanner(System.in);
		int num =sc.nextInt();
		boolean isprime= true;
		
		if(1>num) {
			isprime=false;
		}
		else {
			for(int i=0;i<num; i++) {
				if(num%2==0) {
					isprime=false;
					break;
				}
			}
			
			if(isprime) {
				System.out.println("this is prime number");
			} else {
				System.out.println("this is not prime number");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc= new Scanner(System.in);
//		int num=sc.nextInt();
//		boolean isprime=true;
//		if(1>=num) {
//			isprime=false;
//		}
//		else {
//			for(int i=2;i<num;i++) {
//				if(num%i==0) {
//					isprime=false;
//					break;
//				}
//			}
//			if(isprime) {
//				System.out.println("this is  prime  number " +num);
//			}
//			else {
//				System.out.println("this is not prime number " +num);
//			}
//			
//		}
		
		
	}

}
