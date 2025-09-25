package com.basic.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import com.collection.set.CreatTreeSet;

public class ArrayEx1 {
	private static final Logger log = Logger.getLogger(CreatTreeSet.class.getName());

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		List<Integer> b = new ArrayList<Integer>();
        
	
		for (int i = 0; i < a.size(); i++) {
		
				if (i == 0) {
					b.add(a.get(i));
					break;
				}
			}
		  log.info(b.toString());

	}

}
