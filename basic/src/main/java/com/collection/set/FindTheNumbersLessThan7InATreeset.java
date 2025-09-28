package com.collection.set;

import java.util.NavigableSet;

import java.util.TreeSet;
import java.util.logging.Logger;

public class FindTheNumbersLessThan7InATreeset {

	private static final Logger log = Logger.getLogger(FindTheNumbersLessThan7InATreeset.class.getName());

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(7);
		set.add(8);
// less than 7 all element
		NavigableSet<Integer> lesstan7 = set.headSet(7, false);
		log.info("less than equal :" + lesstan7 + "");
		// greatertan equal
		NavigableSet<Integer> greaterthanequl = set.tailSet(4, true); // tailset use the equl and greater than
		log.info("greter than or equal :" + greaterthanequl + "");
        // lessthan in equal
		NavigableSet<Integer> lessthanequl = set.headSet(4, true);
		log.info("less than equal :"+lessthanequl);
	}
}
