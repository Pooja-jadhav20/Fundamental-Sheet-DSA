package LogicalCode;

public class largefact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		int n=28;
		 for(int i=1;i<n;i++) {
			 if(n%i==0) {
				 if(i>max) {
					 max=i;
				 }
			 }
		 }
		 System.out.println(max);

	}

}
