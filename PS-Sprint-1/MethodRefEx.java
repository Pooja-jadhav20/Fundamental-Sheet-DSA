package SteamAPIS;

import java.util.Arrays;
import java.util.List;

public class MethodRefEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> str=Arrays.asList("pooja","Prem","praveen");
     List<String> unames=str.stream()
    		 .map(name->name.toUpperCase())
    		 .toList();
     System.out.println(unames);
	}

}
