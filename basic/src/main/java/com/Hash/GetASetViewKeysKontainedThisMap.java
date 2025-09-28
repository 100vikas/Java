package com.Hash;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class GetASetViewKeysKontainedThisMap {

	public static final Logger log = Logger.getLogger(GetASetViewKeysKontainedThisMap.class.getName());

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("vikas", 101);
		map.put("rahul", 102);
		map.put("mahesh", 103);
		map.put("ramesh", 98);
		map.put("suresh", 104);
		log.info(map.toString());
//		Write a program to get a set view of the keys contained in this map.
	
		Set<String> keySet = map.keySet();
		log.info(keySet.toString());

		for (String kye : keySet) {
			log.info(kye);
		}
		
//		Write a program to get a collection view of the values contained in this map.	
		Collection<Integer> value = map.values();
		log.info(value.toString());

		for (Integer values : value) {
			log.info(values.toString());
		}
		

	}

}
