package com.Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class CopyOneMapToAnotherMap {
	public static final Logger log = Logger
			.getLogger(CopyOneMapToAnotherMap.class.getName());

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("vikas", 101);
		map.put("rahul", 102);
		map.put("mahesh", 103);
		map.put("vikas", null); // remove first value and set new value
		map.put(null, 105);
		map.put(null, null);

		log.info(map + "");

	

		Map<String, Integer> map2 = new HashMap<>(map); // new HashMap<>(map); using this metthod
		map2.putAll(map); // using put all method
		for (Map.Entry<String, Integer> entry : map.entrySet()) {   // using manualy
               map2.put(entry.getKey(), entry.getValue());
		}

		log.info(map2 + "");

	}
  
}
