package com.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class RemoveAndReturnTheFirstElementFfLinkedList {
	private static final Logger log = Logger.getLogger(RemoveAndReturnTheFirstElementFfLinkedList.class.getName());

	public static void main(String[] args) {

		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		log.info(list1.toString());

		list1.removeFirst(); 							//using method remove
		log.info(list1.toString());						// get first
		
		
		
		for (int i = 0; i < list1.size(); i++) {
			if (i == 0) {
				list1.remove(i); 						// remove first element
			}
		}
		log.info(list1.toString()); 					// print first element
		

	}

}
