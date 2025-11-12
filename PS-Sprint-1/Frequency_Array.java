package Demo;

import java.util.HashMap;
import java.util.HashSet;

public class Frequency_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,30,10,20,40,30,20,50};
		
		HashMap<Integer, Integer> ref= new HashMap<>();
		
		for(int num:arr) {
			if(ref.containsKey(num)) {
				ref.put(num, ref.get(num)+1);
			}else {
				ref.put(num, 1);
			}
		}
		 for(int key: ref.keySet()) {
			 System.out.println(key+" occurse:"+ref.get(key));
		 }

	}

}
