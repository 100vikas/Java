package com.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class GetTheNumberOfElementsInaHashet {
	public static final Logger log = Logger.getLogger(GetTheNumberOfElementsInaHashet.class.getName());

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

//		log.info(set.toString());

		for (Integer i : set) {
			    log.info(i.toString());

		}
	}
}
