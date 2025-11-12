package LogicalCode;

public class fist5oddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=5;
		int sum=0;
		int num=1;
		for(int i=0;i<N;i++) {
			sum+=num;
			num+=2;
		}
		System.out.print(sum);
	}

}
