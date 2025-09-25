package com.collection.set;


import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class ConvertAHashsetToAnArray {
	public static final Logger log = Logger.getLogger(ConvertAHashsetToAnArray.class.getName());

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(5);

		log.info(set + " ");

		Integer arr[] = new Integer[set.size()];

		set.toArray(arr);

//        using for loop
//		int index = 0;
//		for (Integer i : set) {
//			arr[index] = i;
//			index++;
//		}
		for (int i = 0; i < arr.length; i++) {
			log.warning(arr[i] + " ");
		}

	}
}
