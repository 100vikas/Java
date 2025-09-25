package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetIntersection {

	public static <T> Set<T> findCommonElements(Set<T> set1, Set<T> set2) {
		// Create a new set to store the common elements
		Set<T> commonElements = new HashSet<>(set1);
		// Retain only the elements that are also present in set2
		commonElements.retainAll(set2);
		return commonElements;
	}

	public static void main(String[] args) {
		Set<String> setA = new HashSet<>();
		setA.add("Apple");
		setA.add("Banana");
		setA.add("Orange");

		Set<String> setB = new HashSet<>();
		setB.add("Orange");
		setB.add("Grape");
		setB.add("Banana");

		Set<String> resultSet = findCommonElements(setA, setB);
		System.out.println("Set A: " + setA);
		System.out.println("Set B: " + setB);
		System.out.println("Common elements: " + resultSet);
	}
}
