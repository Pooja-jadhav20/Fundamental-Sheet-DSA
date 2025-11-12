 package LogicalCode;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num =2031;
		if((num%4==0 && num%100!=0 )|| (num%400==0)) {
			System.out.println("this is leap year");
			//num++;
		}
		else {
			System.out.println("this is not leap year");
		}

	}

}
