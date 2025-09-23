package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class ReverseElementsArrayList {
	private static final Logger log = Logger.getLogger(AddElementToFirstInArrayList.class.getName());

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 2, 1, 4, 3, 6));

		 
		log.info(list.reversed().toString()); // using method
		
		for(int i=list.size()-1;i>=0;i--) {
			log.info(list.get(i).toString());
		}

	}

}
