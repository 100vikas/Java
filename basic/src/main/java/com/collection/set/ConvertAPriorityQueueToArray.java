package com.collection.set;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.Logger;


public class ConvertAPriorityQueueToArray {
	public final static Logger log = Logger.getLogger(ConvertAPriorityQueueToArray.class.getName());

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(5);
		pq.add(20);
		pq.add(1);

		// Convert PriorityQueue to Array
		Object[] arr = pq.toArray();

		// Print the array elements
		for (Object elem : arr) {
			log.info(elem.toString());
		}

//		manually add

		int size = pq.size();

		Integer[] a = new Integer[size];
		int index = 0;

		for (Integer i : pq) {
			a[index] = i;
			index++;
		}
		for (int i = 0; i < a.length; i++) {

			log.info(a[i].toString());
		}

		// insert a given element into a priority queue.
		addval ad=new addval();
		   ad.add(10);
		   ad.add(20);
	}
}

class addval {

	public void add(int ele) {
		final Logger log = Logger.getLogger(ConvertAPriorityQueueToArray.class.getName());
		Queue<Integer> que = new PriorityQueue<>();
		       
		 que.add(ele);  
		    log.info(que+"");
		    
		    
	}
}
