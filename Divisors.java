package LogicalCode;

public class Divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				System.out.println( " the number can be divided by: "+i);
			}
		}

	}

}
