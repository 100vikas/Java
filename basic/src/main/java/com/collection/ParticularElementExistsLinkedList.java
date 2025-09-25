package com.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class ParticularElementExistsLinkedList {
	private static final Logger log = Logger.getLogger(ParticularElementExistsLinkedList.class.getName());

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

		if (list.contains(44)) {
			log.info("the element is present");
		}

		// Using Forloop
		int ele = 5;
		for (int i = 0; i < list.size(); i++) {
			if (ele == list.get(i)) {
				log.info("the element is present");
			}

		}

	}

}
