package com.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public class AddSomeColorsAndPrintoutTreeset {
	public static final Logger log = Logger.getLogger(AddSomeColorsAndPrintoutTreeset.class.getName());

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("red");
		set.add("green");
		set.add("blue");
		set.add("white");
		log.info(set + "");

		for (String i : set) {
			log.info(i);
		}

		Iterator<String> iteratorset = set.iterator();
		while (iteratorset.hasNext()) {
			log.info(iteratorset.next());
		}
		Set<String> set2 = new TreeSet<>(); // direct object throw pass setname

         set2.addAll(set);
			log.info(set2 + "");
         
	}

}
