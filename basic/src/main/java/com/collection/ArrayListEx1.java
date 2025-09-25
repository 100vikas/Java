package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(7);
		for (int i = 1; i <= 5; i++) {
			arr.add(i); // adding element to list
		}
		System.out.println(arr);

		arr.remove(2); // remove element index wise from list;
		System.out.println(arr);

		for (int i = 0; i < arr.size(); i++) { // size method used for count of element
			System.out.print(arr.get(i) + " ");

		}
		System.out.println("\n");

		// addall // add all data at time

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("swift");
		cars.add("scorpio");
		cars.add("bmw");
		cars.add("ford");

		System.out.println(cars);

		List<String> brands = new ArrayList<String>();
		brands.add("apple");
		brands.addAll(cars);
		System.out.println(brands);
		System.out.println(" carse :" + cars);

		List<String> cars2 = (ArrayList) cars.clone();
		cars2.set(0, "Toyota"); // remove previes element set new element this index value
		System.out.println(cars);
		System.out.println(cars2);

		System.out.println();
		System.out.println(cars.contains("bmw")); // check the this element existing this list;
		System.out.println(cars.get(3)); // give this index position value
		System.out.println(cars.isEmpty()); // return boolean value object is empty to return true otherwise false;
//		cars.remove(0);                            		// remove a this position value  
//		cars.removeAll(cars); 							// remove all record in the list
		System.out.println(cars);
		System.out.println(cars.subList(1, 3)); // Return a sublist which provides access to a range of this list's
												// items

		// toArray
		Object[] carsArray = cars.toArray();
		for (Object item : carsArray) { // The toArray() method returns an array containing all of the items in the
										// list.
			System.out.println(item);
		}
		cars.clear(); // clear all data in cars
	}

}
