package com.collection;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Logger;

public class IterateLinkedListReverseOrder {
	private static final Logger log = Logger.getLogger(AddElementToFirstInArrayList.class.getName());

	public static void main(String[] args) {

	
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

		log.info(list.toString());

		log.info("Reverse order using descendingIterator(): ");
		Iterator<String> descendingIt = list.descendingIterator();
		while (descendingIt.hasNext()) {
			log.info(descendingIt.next() + " ");
		}
		System.out.println();
	}
}
