package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class UpdatesPecificArrayElementArrayList {
	private static final Logger log = Logger.getLogger(AddElementToFirstInArrayList.class.getName());

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
          
	           list.set(3, 5);
		        
		log.info(list.toString());
	}

}
