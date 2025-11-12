package LogicalCode;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[] arr= {12,24,36,6};
		int result=arr[0];
		for(int i=1;i<arr.length;i++) {
			result=findGCD(result, arr[i]);
		}
		System.out.println(result);
	}

	private static int findGCD(int a, int b) {
		while(b!=0) {
			int  temp=b;
			b=a%b;
			a=temp;
			
		}
		return a;
	}
	 

}
