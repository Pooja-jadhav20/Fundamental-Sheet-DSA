package LogicalCode;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programing";
		String reverce=" ";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverce+=str.charAt(i);
		}
   System.out.println(reverce);
	}

}
