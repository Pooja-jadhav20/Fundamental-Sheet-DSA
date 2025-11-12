package LogicalCode;

public class VowelConsonantCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="hello world";
		input=input.toLowerCase();
		int vowels=0 ; int consonent=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch >= 'a' && ch<='z') {
              if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
            	  vowels++;
              }
              else {
            	  consonent++;
              }
			}
		}
		System.out.println("the total number of vowels is : " +vowels +" & "+"consonent is :" +consonent);

	}

}
