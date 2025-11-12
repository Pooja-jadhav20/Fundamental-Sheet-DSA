package Array_Strings;

public class LargestPrimeFact {

	public static void main(String[] args) {
		int n=28;
		int larg=1;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				if(isprime(i)) {
					larg=i;
				}
			}
		}
		System.out.println(larg);

	}

	private static boolean isprime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=num;i++) {
			if(num%2==0) {
				return false;
			}
		}
		return true;
	}

}
