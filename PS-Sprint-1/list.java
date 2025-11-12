package com.Kodnest.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class list {
	public static void main(String[] args) {
		 List<Integer> l1=new ArrayList<>();
//		l1.add(4);
//		l1.add(2);
//		l1.add(5);
//		l1.add(1);
//		l1.add(3);
//		l1.add(3);
//		l1.add(3);
//		
//		System.out.println("unsorted list"+l1);
//		
//		Collections.sort(l1);
//		System.out.println("sorted list"+l1);
//		
//		System.out.println("binary search result:"+Collections.binarySearch(l1, 4));
//		System.out.println("Frequency of 3: "+Collections.frequency(l1, 3));
//		Collections.shuffle(l1);
//		System.out.println("shuffled list:" +l1);
//		
//		Collections.swap(l1, 0, 1);
//		System.out.println("first 2 elements is swaped:"+l1);
//		
//		Collections.fill(l1, 4);
//		System.out.println("List filled with 4:"+l1);
		
		Thread t1=new Thread(()->{
			synchronized (Main.class) {
			Random random=new Random();
			l1.add(random.nextInt());
			}
		});
		
		Thread t2=new Thread(()->{
			System.out.println("reading the list:"+l1);
		});
		t1.start();
		t2.start();
	}

}
