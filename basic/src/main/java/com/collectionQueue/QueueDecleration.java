package com.collectionQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.Logger;

import com.collection.set.CompareTwoHashset;

public class QueueDecleration {
	public static final Logger log = Logger.getLogger(CompareTwoHashset.class.getName());

	public static void main(String[] args) {

		Queue<Integer> queue = new PriorityQueue<Integer>();

		queue.add(10);
		queue.add(10);
		queue.add(4);
		queue.add(5);
		queue.add(3);
		queue.add(2);
		queue.add(2);
		queue.offer(6);
		log.info(queue + "");
//	    log.info(queue.peek()+"");          // get first element 
//	    log.info(queue.poll()+"");          // get and remove first elemet
//	    log.info(queue + ""); 
//	    log.info(queue.remove()+"");
	    
	      Iterator<Integer>iterator=queue.iterator();
	      while(iterator.hasNext()) {
	    	  log.info(iterator.next()+"");
	      }
	    
	      Queue<Integer> queue2 = new PriorityQueue<Integer>();       //PriorityQueue<Integer>(queue);pass a another prioriry queue values
	        
	      queue2.addAll(queue);
	      log.info(queue2+"");
	   
	}
}
