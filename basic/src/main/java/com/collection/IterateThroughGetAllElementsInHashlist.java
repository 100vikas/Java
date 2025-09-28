package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

public class IterateThroughGetAllElementsInHashlist {
	public static final Logger log = Logger.getLogger(IterateThroughGetAllElementsInHashlist.class.getName());

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(50);
		set.add(60);

		
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			log.info(iterator.next().toString());

		}
	}

}
