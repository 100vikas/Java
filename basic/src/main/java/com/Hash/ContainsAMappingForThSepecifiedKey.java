package com.Hash;

import java.util.HashMap;
import java.util.Map;

import java.util.Set;
import java.util.logging.Logger;

public class ContainsAMappingForThSepecifiedKey {
	public static final Logger log = Logger.getLogger(ContainsAMappingForThSepecifiedKey.class.getName());

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("vikas", 101);
		map.put("rahul", 102);
		map.put("mahesh", 103);
		log.info(map.toString());

		String key = "amol";

		if (map.containsKey(key)) {
			log.info("present key");
		} else {
			log.info(" not present key");
		}
		int cnt = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (key.equals(entry.getKey())) {
				cnt++;

			}
		}
		if (cnt > 0) {
			log.info("present key");
		} else {
			log.info(" not present key");
		}
		
		// Write a program to create a set view of the mappings contained in a map.
		
		   Set<Map.Entry<String, Integer>>set=map.entrySet();
		   
		   for(Map.Entry<String,Integer> entry:set) {
			     log.info(entry.getKey() +" "+entry.getValue());
		   }
		  // Write a program to get the value of a specified key in amap.
		       
		       String keys="hah";
		       Integer value=map.get(keys);
		       if(map.containsKey(keys)) {
		    	   log.info("valus is :"+value);
		       }
		       else {
		       log.info("key is envalid");
		       }
//		      for (Map.Entry<String, Integer> entry : map.entrySet()) {
//		    	      
//		      }
		       
		        

		        
		        

	}

}
