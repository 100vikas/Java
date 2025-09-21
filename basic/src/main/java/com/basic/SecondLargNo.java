package com.basic;

public class SecondLargNo {
	public static void main(String[] args) {
		int a[] = { 1000, 500, 200, 30, 400 };

		int max = 0;
		int secMax = 0;

		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}

		System.out.println("Max - " + max);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != max && secMax < a[i]) {
				secMax = a[i];
			}

		}

		System.out.println("Sec Max - " + secMax);

	}
}
