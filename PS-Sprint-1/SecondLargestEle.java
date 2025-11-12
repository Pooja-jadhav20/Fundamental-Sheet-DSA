package Demo;

public class SecondLargestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {20,40,30,92,100,120};
		 int F=arr[0];
		 int S=-1;
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>F) {
				 S=F;
				 F=arr[i];
				 
			 }
			 else {
				 if(arr[i]>S && F!=arr[i]) {
					 S=arr[i];
				 }
			 }
			 
		 }
		 System.out.println("fisrt:"+F);
		 System.out.println("second"+S);
	}

}
