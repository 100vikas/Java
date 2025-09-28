package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class RemoveDuplicateArrayList {
	
	
	private static final Logger log=Logger.getLogger(RemoveDuplicateArrayList.class.getName());
	
	    public static void main(String[] args) {
	        List<Integer> listWithDuplicates = new ArrayList<>();
	        listWithDuplicates.add(1);
	        listWithDuplicates.add(2);
	        listWithDuplicates.add(1);
	        listWithDuplicates.add(3);
	        listWithDuplicates.add(2);
	        
	        Set<Integer> set = new HashSet<Integer>();
	        
	        List<Integer> result =  listWithDuplicates.stream().filter(num -> !set.add(num)).collect(Collectors.toList());
	        System.out.println("Duplicate elements : "+ result);
	        
//	        log.info(listWithDuplicates.toString());
//
//	        Set<Integer> uniqueElements = new LinkedHashSet<>(listWithDuplicates); // the linkedhashset remove duplicate values and store only unique value 
//	        List<Integer> listWithoutDuplicates = new ArrayList<>(uniqueElements);
//	        log.info("arrayList without duolicates "+listWithoutDuplicates.toString());
	    }
	}


