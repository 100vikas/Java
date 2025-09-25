package com.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CloneArrayListToAnotherArrayLis {
	private static final Logger log = Logger.getLogger(CompareTwoArrayList.class.getName());

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		log.info(list1.toString());
//		ArrayList<Integer>list2 =(ArrayList<Integer>)list1.clone());  // not support
		List<Integer>list2=new ArrayList<Integer>();
		   list2.addAll(list1);
		   log.info(list2.toString());
				
		 
	}

}
