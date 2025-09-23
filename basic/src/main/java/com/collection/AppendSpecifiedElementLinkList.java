package com.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class AppendSpecifiedElementLinkList {
	private static final Logger log = Logger.getLogger(AddElementToFirstInArrayList.class.getName());

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		log.info(list.toString());
	     
		list.addLast(10);
		log.info(list.toString());
	}
	

}
