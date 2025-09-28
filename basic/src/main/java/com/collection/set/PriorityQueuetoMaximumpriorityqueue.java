package com.collection.set;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.Logger;

public class PriorityQueuetoMaximumpriorityqueue {
	public final static Logger log = Logger.getLogger(PriorityQueuetoMaximumpriorityqueue.class.getName());

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(5);
		pq.add(20);
		pq.add(1);
		
		log.info(pq.poll()+"");
		  int maxPriority=0;
		  for(Integer i:pq) {
			  if(i==pq.poll()) {
				  maxPriority=i;
			  }
		  }
		  log.info("maxPriority :"+maxPriority);
		  
	}

}
