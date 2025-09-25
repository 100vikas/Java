package com.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Logger;

public class IterateThroughAllElementsInHashlist {
	public static void main(String[] args) {
		final Logger log = Logger.getLogger(AppendTheSpecifiedElementHashset.class.getName());
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(5);
		set.add(null);                  // iterator show exception null value
		log.info(set.toString());

		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			log.info(iterator.next().toString());
		}
		
	}

}
