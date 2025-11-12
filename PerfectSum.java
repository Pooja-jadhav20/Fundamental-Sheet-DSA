package LogicalCode;

public class PerfectSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int num=1;num<30;num++) {
			int sum=0;
			for(int i=1;i<=num/2;i++) {
				if(num%i==0) {
					sum+=i;
				}
			}
			if(num==sum) {
				System.out.println(num);
				count++;
			}
			
		}
		System.out.print(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int count=0;
//		for(int num=1;num<30;num++) {
//			int sum=0;
//			for(int i=1;i<=num/2;i++) {
//				if(num%i==0) {
//					sum+=i;
//				}
//			}
//			if(sum==num) {
//				System.out.println(num);
//				count++;
//			}
//		}
//		System.out.println(count);
	}

}
