package com.basic.Array;

import java.util.logging.Logger;
import java.util.Arrays;              // Add this import

public class Ex2 {
	public static final Logger log = Logger.getLogger(Ex2.class.getName());
	static int arr[] = new int[5];
	static int index = 0;

	public static void main(String[] args) {
		add(10);
		add(20);
		remove();
		log.info(Arrays.toString(arr));
	}

	public static void add(int el) {
		arr[index] = el;
		index++;
	}

	public static void remove() {
		index--;
		arr[index] = 0;
	}
}
