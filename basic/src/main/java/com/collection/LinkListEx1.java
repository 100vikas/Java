package com.collection;

import java.util.LinkedList;

public class LinkListEx1 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(7);
		for (int i = 1; i <= 5; i++) {
			list.add(i);
		
		}
		
		System.out.println(list);

		for (int i = 1; i < list.size(); i++) {
			System.out.print(i + " ");
		}
	

		System.out.println();
		LinkedList<String> names = new LinkedList<String>();
		names.add(null); // null value allowed
		names.add("vikas");
		names.add("rahul");
		names.add("mahesh");
		names.add("ramesh");
		System.out.println(names +"\n");
		names.addFirst("rohit"); // the Adds an element to the first of the list
        names.addLast("kiran");  // athe adds an element to thr last of the list 
        System.out.println(names + "\n"); 
        names.removeFirst();      // remove the first element in firstt of the list
        names.removeLast();       // remove the last elemenrt in the last of the list 
        System.out.println(names + "\n");
         	
        System.out.println( "first element is :"+names.getFirst()); //get the element at the first of the list
        System.out.println("last element is : "+names.getLast());    // get the element  at the last of the list
		System.out.println(names);       
		

	}

}
