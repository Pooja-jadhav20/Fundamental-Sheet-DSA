package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallalStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int  size=10_000;
     List<Integer> nums=new ArrayList<>(size);
     Random ram= new Random();
     
     for(int i=1;i<=size;i++) {
    	 nums.add(ram.nextInt(100));
     }
     long startSeq= System.currentTimeMillis();
     int sum1= nums.stream()
    		 .map(i-> i*2)
    		 .reduce(0, (c,e)->c+e);
     long endSeq =System.currentTimeMillis();
     
     long startPara= System.currentTimeMillis();
     int sum2=nums.stream()
    		 .map(i-> i*2)
    		 .mapToInt(i->i)
             .sum();
     long endPara =System.currentTimeMillis();
     
     int sum3=nums.parallelStream()
    		 .map(i-> i*2)
    		 .mapToInt(i->i)
             .sum();
     System.out.println(sum1 +" "+ sum2+ " "+sum3);
     System.out.println("Seq :" +(endSeq-startSeq));
     System.out.println("Para :" +(endPara-startPara));
	}

}
