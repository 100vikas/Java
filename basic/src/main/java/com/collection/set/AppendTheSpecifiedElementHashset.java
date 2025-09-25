package com.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class AppendTheSpecifiedElementHashset {
	public static final Logger log = Logger.getLogger(AppendTheSpecifiedElementHashset.class.getName());

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		set.add(10); // using method
		set.add(11);
		set.add(9);
		log.info(set.toString());

	}

}
