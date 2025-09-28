package com.Hash;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

public class InsetTheValueInTreeMap {
	public static final Logger log = Logger.getLogger(InsetTheValueInTreeMap.class.getName());

	public static void main(String[] args) {

		Map<Integer, String> treeMap = new TreeMap<>();

		// Associate specified values with specified keys using put()
		treeMap.put(10, "vikas");
		treeMap.put(15, "ramesh");
		treeMap.put(20, "rahul");
		treeMap.put(25, "pravin");
		// Print the TreeMap
		log.info("TreeMap contents: " + treeMap);

		// Update an existing key's value
		String oldValue = treeMap.put(20, "mahesh");

		// Print the previous value for the key 20
		log.info("Old value associated with key 20 was: " + oldValue);

		// Print the TreeMap after update
		log.info("TreeMap after update: " + treeMap);
		// Write a program to search a key in a Tree Map.

		int key = 21;
		int cnt = 0;
		// using forloop
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			if (key == entry.getKey()) {
				cnt++;
			}
		}
		if (cnt > 0) {
			log.info("key is present");
		} else {
			log.info("not present");
		}

		if (treeMap.containsKey(key)) {
			log.info("key is present");
		} else {
			log.info("not present");
		}

		// Write a program to copy a Tree Map content to another Tree Map.
		Map<Integer, String> treeMap2 = new TreeMap<Integer, String>(); // TreeMap<Integer, String>(treeMap); usong
																		// direct pass boject

		treeMap2.putAll(treeMap); // using putall method
		log.info("copy treemap is :" + treeMap2);
		
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			 treeMap2.put(entry.getKey(), entry.getValue());
		}
		log.info("using for loop:" + treeMap2);
		
		//Write a program to get all keys from the given a Tree Map.
		// Using loop
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			 log.info(entry.getKey()+"");
		}
		// method method
		 log.info(treeMap.keySet().toString());
		 
		//Write a program to delete all elements from a given Tree Map.
		//Using Method
//		 treeMap.clear();
		 log.info(treeMap.toString());
		 //Using For Loop
		 Iterator<Integer>it=treeMap.keySet().iterator();
		 while(it.hasNext()) {
			 it.next();
			 it.remove();
		 }
		 log.info("using iterator"+treeMap.toString());
	}
	
	
}
