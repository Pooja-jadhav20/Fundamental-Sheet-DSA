package com.Kodnest.Collection;

public class Array {
// logic  to create the Array
	private int arr[];
	public Array(int size) {
		arr=new int [size];
		System.out.println("Array of size"+size+"is Creted");
		
	}
	public void insert(int index,int element) {
		
	if(index>0 && index<=arr.length-1) {
		arr[index]=element;
		System.out.println("Element:"+element+"insert At"+index);
		
	}
	else {
		System.out.println("enter index in the range o(zero)"+(arr.length-1));
	}
	}
	public void delete(int index) {
		//Logic to delete
		
		
		
	}
 public void display() {
	 
 }
 
 public int search(int key) {
	 
	 
	return -1;
	 
 }
 public void sort() {
	 
 }
}
