package com.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class RemoveSpecifiedElementFromLinkedList {
	private static final Logger log = Logger.getLogger(DisplayTheElementAndTheirPositionsLinkedList.class.getName());

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7));
		log.info(list.toString());
		list.remove(3); // remove the using method and indexwise

		log.info(list.toString());

		for (int i = 0; i < list.size(); i++) { // remove index wise
			if (i == 4) {
				list.remove(i);
			}
		}
		log.info(list.toString());
		int e = 6;
		for (int i = 0; i < list.size(); i++) { // remove element wise
			if (e ==list.get(i)) {
				list.remove(i);
			}
		}
		log.info(list.toString());

	}
}
