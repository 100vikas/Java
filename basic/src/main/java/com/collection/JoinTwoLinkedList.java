package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class JoinTwoLinkedList {
	private static final Logger log = Logger.getLogger(JoinTwoArrayLists.class.getName());

	public static void main(String[] args) {

		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		log.info(list1.toString());

		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		log.info(list2.toString());

		list2.addAll(list1);
		log.info(list2.toString()); 								//using method

		List<Integer> list3 = new LinkedList<Integer>();

		for (int i = 0; i < list1.size(); i++) { 					//using forloop
			list3.add(list1.get(i));
		}
		for (int i = 0; i < list1.size(); i++) {
			list3.add(list2.get(i));
		}

		log.info(list3.toString());
	}
}
