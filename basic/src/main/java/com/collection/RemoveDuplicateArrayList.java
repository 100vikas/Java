package com.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class RemoveDuplicateArrayList {
	
	
	private static final Logger log=Logger.getLogger(RemoveDuplicateArrayList.class.getName());
	    public static void main(String[] args) {
	        List<Integer> listWithDuplicates = new ArrayList<>();
	        listWithDuplicates.add(1);
	        listWithDuplicates.add(2);
	        listWithDuplicates.add(1);
	        listWithDuplicates.add(3);
	        listWithDuplicates.add(2);
	        log.info(listWithDuplicates.toString());

	        Set<Integer> uniqueElements = new LinkedHashSet<>(listWithDuplicates); // the linkedhashset remove duplicate values and store only unique value 
	        List<Integer> listWithoutDuplicates = new ArrayList<>(uniqueElements);
	        log.info("arrayList without duolicates "+listWithoutDuplicates.toString());
	    }
	}


