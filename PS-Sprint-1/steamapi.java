package SteamAPIS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class steamapi {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,2,3,4);
//		Stream<Integer> s1=nums.stream();
//		Stream<Integer> s2=s1.filter(n->n%2==0);
//		Stream<Integer> s3=s2.map(n->n*2);
//		
//		int result=s3.reduce(0, (c,e)->c+e);
		
//		int result=nums.stream()
//					   .filter(n->n%2==0)//o/p->2,4
//					   .map(n->n*2)//4,8
//					   .reduce(0,(a,b)->a+b);//4+8=12
//		
//		System.out.println(result);
		
		//s3.forEach(n->System.out.print(" "+n));
		
		
		Stream<Integer> sort=nums.stream()
		.filter(n->n%2==0)
		.sorted();
       sort.forEach(n->System.out.print(" "+n));
	}

}
