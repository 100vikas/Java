package com.Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class key_valueMappingsEmptyorNot {
	public static final Logger log = Logger.getLogger(key_valueMappingsEmptyorNot.class.getName());

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("vikas", 101);
		map.put("rahul", 102);
		map.put("mahesh", 103);
		log.info(map.toString());
		
		if(map.isEmpty()) {
			log.info("map is empty");
		}
		else {
			log.info("not empty");
		}
		
		 map.clear();

			if(map.isEmpty()) {
				log.info("map is empty");
			}
			else {
				log.info("not empty");
			}
		 
	}
}
