package Array_Strings;

import java.util.HashSet;
import java.util.Set;

public class unique_value {

	public static void main(String[] args) {
	int[] arr= {1,2,4,1,5,2,1,6,7};
	Set<Integer> set=new HashSet<>();
	for(int num : arr) {
		set.add(num);
		
	}
	System.out.println(set);

	}

}
