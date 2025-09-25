package com.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class ReplaceElementLinkedList {
	private static final Logger log = Logger.getLogger(ReplaceElementLinkedList.class.getName());

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
//		          for(int i=0;i<list.size();i++) {
//		        	     if(i=3) {
//		        	    	 list.replaceAll(10);
//		        	     }
//		          }
		log.info(list.toString());
		list.set(2, 5);
		log.info(list.toString());

	}
}
