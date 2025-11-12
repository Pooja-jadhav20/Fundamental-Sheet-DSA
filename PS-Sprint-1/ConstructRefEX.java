package SteamAPIS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructRefEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<String> names=Arrays.asList("pooja","Praveen","ram");
 List<Student> students=new ArrayList<>();
 students=names.stream()
		 .map(Student::new)
		 .toList();
 System.out.println(students);
	}

}
