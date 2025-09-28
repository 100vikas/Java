package com.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class RemoveAllElementHashset {
	public static final Logger log = Logger.getLogger(RemoveAllElementHashset.class.getName());

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(50);
		set.add(60);

		log.info(set.toString());
//		set.removeAll(set);                      				// using method removeall
//		log.info(set.toString());

		removeallel rem = new removeallel();
            rem.removeallelemet(set);
            log.info(set.toString());
	}

}

class removeallel {

	static void removeallelemet(Set<Integer> set) {
		    set.removeAll(set);

	}
}
