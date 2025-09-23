package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;

public class VectorEx1 {
	
	public final static Logger log = Logger.getLogger("VectorEx1");
	
	public static void main(String[] args) {
		
		List<Integer>vec=new ArrayList<Integer>();
		
		vec.add(1);
		vec.add(5);
		vec.add(3);
		vec.add(4);
		vec.add(5);
				
//		ListIterator<Integer> iterator = vec.listIterator();
//		while(iterator.hasNext()) {
//			if(iterator.next()==3) {
//				iterator.remove();
//			}
//		}
		
		log.info(String.valueOf(vec.toString()));
	}

}
