package LogicalCode;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=154;
		int length=String.valueOf(num).length();
		double count=0;
		int original=num;
		
		while(num!=0) {
			int temp=num%10;
			count+=Math.pow(temp, length);
			num/=10;
				
			
		}
		if(count==original) {
			System.out.println("this is a armstrong number");
		}else {
			System.out.println("this is not arm strong number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int num=153;
//		double count=0;
//		int length=String.valueOf(num).length();
//		int OriginalNO=num;
//		
//		while(num!=0) {
//			int temp=num%10; // last gidit
//			count+=Math.pow(temp, length);
//			num /=10;  // remove last digit
//			
//		}
//		if(count==OriginalNO) {  
//			System.out.println("this arnStrong ");
//		}else {
//			System.out.println("this is not");
//		}
	}

}
