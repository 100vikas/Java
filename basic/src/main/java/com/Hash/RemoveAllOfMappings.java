package com.Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

public class RemoveAllOfMappings {

	public static final Logger log = Logger.getLogger(RemoveAllOfMappings.class.getName());

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("vikas", 101);
		map.put("rahul", 102);
		map.put("mahesh", 103);
		log.info(map.toString());
		map.clear(); // using method
		log.info(map.toString());
		map.put("vikas", 101);
		map.put("rahul", 102);
		map.put("mahesh", 103);
		log.info(map.toString());
         // using manually
		Iterator<String>it=map.keySet().iterator();
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
         log.info(map.toString());
	}

}
