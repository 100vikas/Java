package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.logging.Logger;

public class ExtractPortionOfArrayList {

	private static final Logger log = Logger.getLogger(ExtractPortionOfArrayList.class.getName());

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		log.info(list.toString());

		List<Integer> extractlist = list.subList(1, 5);          // return element between given values            	
		log.info(extractlist.toString());

	}
}