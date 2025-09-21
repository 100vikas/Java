package com.basic;

public class AnagramString {

	public static void main(String[] args) {

		String str1 = "suudy";
		String str2 = "dusty";

		boolean status = true;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				status = false;
				for (int j = 0; j < str2.length(); j++) {
					if (str1.charAt(i) == str2.charAt(j)) {
						str2 = str2.replace(str2.charAt(j), ' ');
						status = true;
						break;
					}
					if (!status) {
						break;

					}
				}

			}
		} else {
			status = false;
		}

		if (status) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagaram");
		}
	}
}
