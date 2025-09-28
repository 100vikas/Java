package com.Hash;

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

public class GreatestKeyAndTheLeastKeyInAMap {
	public static final Logger log = Logger.getLogger(GreatestKeyAndTheLeastKeyInAMap.class.getName());

	public static void main(String[] args) {

		Map<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(10, "vikas");
		treeMap.put(15, "ramesh");
		treeMap.put(20, "rahul");
		treeMap.put(25, "pravin");
		Integer maxKey = 0;
		Integer minKey = Integer.MAX_VALUE;
		String maxValue = null;
		String minValue = null;

		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			Integer key = entry.getKey();
			

			if (key > maxKey) {
				maxKey = key;
			}

			if (key < minKey) {
				minKey = key;
			}

		}

		log.info(maxKey + " " + treeMap.get(maxKey));
		log.info(minKey + " " + treeMap.get(minKey));

		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			if (minKey == null || key < minKey) {
				minKey = key;
				minValue = value;
			}

			if (maxValue == null || key > maxKey) {
				maxKey = key;
				maxValue = value;
			}
		}
		log.info(maxKey + " " + maxValue);
		log.info(minKey + " " + minValue);

//Write a program to get a key-value mapping associated with the greatest key less than or equal to the given key.
     
       
         int keys=0;
		int givenkey =24;
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			   Integer key=entry.getKey();
			    if(givenkey>=key) {
				   keys=key;
		   }  
			   
		}
		      log.info("key is :"+keys+" "+"value is :"+treeMap.get(keys));
		
	}
}