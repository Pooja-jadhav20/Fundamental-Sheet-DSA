package Array_Strings;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="pqrsrqpq";
		int n=s.length();
		int count=0;
		
		for(int i=0;i<n;i++) {
			int left=i , right=i;
			while(left>=0 && right<n && s.charAt(left)==s.charAt(right)) 
			{
			 count++;
			 left--;
			 right++;
			}
			left=i ; right=i+1;
			while(left>=0&&right<n&& s.charAt(left)==s.charAt(right)) {
				count++;
				left--;
				right++;
			}
		}
        System.out.println(count);
	}

}
