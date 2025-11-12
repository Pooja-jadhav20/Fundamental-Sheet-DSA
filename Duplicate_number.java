package Array_Strings;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_number {

	public static void main(String[] args) {
		
		int[] arr= {10,20,10,5,4,5,10,5};
		Set<Integer> set=new HashSet<>();
		Set<Integer> duplicate=new HashSet<>();

		for(int i : arr) {
			if(set.contains(i)) {
				duplicate.add(i);
			}
			else {
				set.add(i);
			}
		}
		System.out.println(duplicate);
		
		
		
		
		
		
		for(int k=0;k<arr.length;k++) {
			for(int l=k+1;l<arr.length;l++) {
				if(arr[k]==arr[l]) {
					System.out.println(arr[k]);
					break;
				}
			}
		}
		

	}

}
