package com.Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class AssociateTheSpecifiedValueWithTheSpecifiedKeyHashMap {
	public static final Logger log = Logger
			.getLogger(AssociateTheSpecifiedValueWithTheSpecifiedKeyHashMap.class.getName());

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("vikas", 101);
		map.put("rahul", 102);
		map.put("mahesh", 103);
		map.put("vikas", null); // remove first value and set new value
		map.put(null, 105);
		map.put(null, null);

		log.info(map + "");

		// count keys
		// using method
		log.info("keycount is : " + map.size());
		// susing method
		int count = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			count++;

		}
		log.info("count :" + count);

		// Write a program to copy all of the mappings from the specified map to another map

		Map<String, Integer> map2 = new HashMap<>(map); // new HashMap<>(map); using this metthod
		map2.putAll(map); // using put all method
		for (Map.Entry<String, Integer> entry : map.entrySet()) {   // using manualy
               map2.put(entry.getKey(), entry.getValue());
		}

		log.info(map2 + "");

	}

}
