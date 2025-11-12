package Demo;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {30,24,57,85,34,71,01};
		int j=arr.length-1;
		
		 
		for(int i=0;i<=j;i++) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
		
		for(int i:arr) {
		System.out.print(i +" ");
		}

	}

}
