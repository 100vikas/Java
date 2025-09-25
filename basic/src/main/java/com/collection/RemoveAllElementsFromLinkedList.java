package com.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class RemoveAllElementsFromLinkedList {
	private static final Logger log = Logger.getLogger(RemoveAllElementsFromLinkedList.class.getName());

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7));

		log.info(list.toString());
		list.removeAll(list); 									// using remove method
		log.info(list.toString());

		for (int i = 0; i < list.size(); i++) { 				// using for loop
			
				list.remove(list.get(i));
			}
		
		log.info(list.toString());

	}
}
