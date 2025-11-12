package LogicalCode;

public class Polindrom {

	public static void main(String[] args) {
		
//		String str="rada   R";
//		str=str.toLowerCase().replaceAll("\\s+", "");
//		boolean ispalin=true;
//		int start=0;
//		int last=str.length()-1;
//		
//		while(start<last) {
//			if(str.charAt(start)!= str.charAt(last)) {
//				ispalin=false;
//				break;
//			}
//			start++;
//			last--;
//		}
//		if(ispalin) {
//			System.out.println("it is polindrom ");
//		}else {
//			System.out.println("it is not polindrom");
//		}
		
		
		String str="Radar  r";
		boolean isPolindron=true;
		str=str.toLowerCase().replaceAll("\\s", "");
		int start=0;
		int last=str.length()-1;
		while(start<last) {
			if(str.charAt(start)!= str.charAt(last)) {
				isPolindron=false;
				break;
			}
			start++;
			last--;
			
		}
		if(isPolindron) {
			System.out.println("this is polindron");
		}
		else {
			System.out.println("this is not a polindron");
		}
			
		
	}

}
