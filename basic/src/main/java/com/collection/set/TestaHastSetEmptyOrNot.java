package com.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class TestaHastSetEmptyOrNot {
	public static final Logger log = Logger.getLogger(TestaHastSetEmptyOrNot.class.getName());

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();

		set.add(1);
		log.info(set.toString());
		if (set.isEmpty()) {
			log.info("set is empty");
		} else {
			log.info("set is not empty");
		}
	}

}
