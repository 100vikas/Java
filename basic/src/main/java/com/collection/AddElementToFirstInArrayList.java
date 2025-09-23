package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class AddElementToFirstInArrayList {

	private static final Logger log = Logger.getLogger(AddElementToFirstInArrayList.class.getName());

	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

//		List<Integer> list = List.of(1,4,7,8,5,2);
//
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));

		list.add(0, 10);    // add firt position element
  
		log.info(list.toString());

	}
}