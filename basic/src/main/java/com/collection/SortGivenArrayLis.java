package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class SortGivenArrayLis {
	private static final Logger log = Logger.getLogger(AddElementToFirstInArrayList.class.getName());

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 2, 1, 4, 3, 6));
          
		Collections.sort(list);            // sort assignding order
		log.info(list.toString());
		
		Collections.sort(list,Collections.reverseOrder());
		log.info(list.toString());
		  
	}

}
