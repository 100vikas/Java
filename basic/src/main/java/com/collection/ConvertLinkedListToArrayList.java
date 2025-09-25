package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class ConvertLinkedListToArrayList {

	private static final Logger log = Logger.getLogger(ParticularElementExistsLinkedList.class.getName());

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

		List<Integer> converArryList = new ArrayList<Integer>(list);

		// using for loop
//		 for(int i=0;i<list.size();i++) {
//			 converArryList.add(list.get(i));
//		 }
		log.info(converArryList.toString());
	}
}
