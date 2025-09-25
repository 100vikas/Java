package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CompareTwoArrayList {
	private static final Logger log = Logger.getLogger(CompareTwoArrayList.class.getName());

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		log.info(list1.toString());

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		log.info(list2.toString());

		if (list1.equals(list2) == true) {
			log.info("list is equal");
		} else {
			log.info("list is not equal");
		}

		list2.add(5);
		
		if (list1.equals(list2) == true) {
			log.info("list is equal");
		} else {
			log.info("list is not equal");
		}

	}
}
