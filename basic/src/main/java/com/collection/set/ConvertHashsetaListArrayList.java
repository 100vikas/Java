package com.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class ConvertHashsetaListArrayList {
	public static final Logger log = Logger.getLogger(CompareTwoHashset.class.getName());

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);                  
		set1.add(5);

		log.info(set1.toString());
		
		List<Integer>list=new ArrayList<Integer>(set1);
		log.info(list.toString());
	}

}
