package com.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class GethefirstAndLastLinkedList {

	private static final Logger log = Logger.getLogger(InsertSomeElementsLinkedList.class.getName());

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();

		list.add(1);
		list.add(2);
		list.add(5);
		log.info("firstElement is :" + list.getFirst() + "\n Last Element is: " + list.getLast());
	}

}
