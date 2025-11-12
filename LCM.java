package LogicalCode;

public class LCM {

	public static int GCDfind(int a, int b) {
 
		 while(b!=0) {
			 int temp=b;
			 b=a%b;
			 a=temp;
		 }
        return a;
	}
	public static int LCMfind(int a, int b) {
		return (a*b)/GCDfind( a,  b);
	}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int lcm= LCMfind(12, 15);
	System.out.println("lcm="+lcm);
	int gcd=GCDfind(12,15);
	System.out.println("gcd ="+gcd);
}
	
}
