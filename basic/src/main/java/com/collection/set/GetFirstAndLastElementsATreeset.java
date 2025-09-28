package com.collection.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class GetFirstAndLastElementsATreeset {

		public static final Logger log = Logger.getLogger(ReverseOrderTreeset.class.getName());

		public static void main(String[] args) {

			TreeSet<Integer> set = new TreeSet<>();
			set.add(9);
			set.add(8);
			set.add(1);
			set.add(5);
			set.add(3);
			log.info(set+"");
			
			
			log.info( "first element :"+set.getFirst()+"");
			log.info("Last element :"+set.getLast());
			
			TreeSet<Integer>cloneset= (TreeSet<Integer>)set.clone();       // using clone method+
			
			   log.info(cloneset+"");
			   
			   log.info(cloneset.size()+"");
			   
			   
			   
			
			
			
	        			
	}

}
