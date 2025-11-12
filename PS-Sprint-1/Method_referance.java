package collection;

import java.util.Arrays;
import java.util.List;

public class Method_referance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>  names= Arrays.asList("pooja","harsh","john","laxmi");
		List<String> uNames=names.stream()
				//.map(name->name.toUpperCase()) this is called method referance
				.map(String :: toUpperCase)
				.toList();
		//System.out.println(uNames); insted of calling this we can write bollow like 
		uNames.forEach(System.out::println);

	}

}
