package com.Hash;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Logger;

public class ReverseOrderViewJKeysGivenMap {
	public static final Logger log = Logger.getLogger(ReverseOrderViewJKeysGivenMap.class.getName());

	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(10, "vikas");
		treeMap.put(15, "ramesh");
		treeMap.put(20, "rahul");
		treeMap.put(25, "pravin");
		log.info(treeMap.toString());

          log.info(treeMap.reversed().toString());                // all reverse
//	 Set<Integer>reversekey=treeMap.descendingKeySet();
//	    log.info(reversekey.toString());
//		
	    
	    List<Integer>reverse=new ArrayList<Integer>(treeMap.keySet());
	        
	        log.info(reverse.reversed().toString());
		  
	}  
}
