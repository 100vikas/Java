package com.basic;

import java.util.HashMap;
import java.util.Map;

public class duplicatenumberofarray {
	public static void main(String[] args) {

		int a[] = { 1, 2, 6, 3, 3, 5, 3, 1, 6 };
		
		Map<Integer, Integer> duplicateCount = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if(duplicateCount.get(a[i])!=null) {
				duplicateCount.put(a[i], duplicateCount.get(a[i])+1);
			} else {
				duplicateCount.put(a[i], 1);
			}
		}
		
		System.out.println(duplicateCount);
	}
}
