package com.collection.set;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.Logger;

public class CountTheNumberOfElementsPriorityqueue {
	public final static Logger log = Logger.getLogger(CountTheNumberOfElementsPriorityqueue.class.getName());

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(5);
		pq.add(20);
		pq.add(1);

		Queue<Integer> pq2 = new PriorityQueue<>();
		pq.add(10);
		pq.add(5);
		pq.add(20);
		pq.add(1);

		// compair to queue

		for (Integer i : pq) {
			for (Integer j : pq2) {
				if (i == j) {

					log.info("the two que are same");
				} else {
					log.info("the two que are not same");
				}

			}
		}

// Write a program to retrieve the first element of the priority queue.
		log.info("first element : " + pq.peek() + "");

//		     using for loop
		   for(Integer i:pq) {
			   if(i==pq.peek()) {
				   
				   log.info("using forloop first elemet" + i);
				   break;
			   }
		   }

		int count = pq.size(); // using method to find count
		log.info(count + "");

		// using manully find count
		int cnt = 0;
		for (Integer i : pq) {
			cnt++;
		}
		log.info(count + "");
	}
}
