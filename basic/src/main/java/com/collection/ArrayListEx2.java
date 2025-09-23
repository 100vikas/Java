package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class ArrayListEx2 {
	private static final Logger log = Logger.getLogger(ArrayListEx2.class.getName());

	public static void main(String[] args) {

		List<String> str = new ArrayList<String>();
		str.add("laptop");
		str.add("computer");
		str.add("TV");
		str.add("bulb");

//		Using For Loop
		for (int i = 0; i < str.size(); i++) {
			log.info(str.get(i));
		}

//		Using while loop
		int i = 0;
		while (i < str.size()) {
			log.info(str.get(i));
			i++;
		}
		
		
//      Using iterator
		Iterator<String> iterator = str.iterator();
		while (iterator.hasNext()) {
			log.info(iterator.next());
		}
	}

}
