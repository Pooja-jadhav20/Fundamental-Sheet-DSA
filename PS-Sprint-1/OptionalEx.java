package SteamAPIS;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> names= Arrays.asList("pooja","ranni","ram");
       String name=names.stream()
    		            .filter(str->str.contains("s"))
    		            .findFirst()
    		            .orElse("Not Foud");
       
       System.out.println(name);
       
	}

}
