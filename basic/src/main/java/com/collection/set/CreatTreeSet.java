package com.collection.set;



import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Logger;

public class CreatTreeSet {
	private static final Logger log=Logger.getLogger(CreatTreeSet.class.getName());
	public static void main(String[] args) {
		
		  SortedSet<Integer>set=new TreeSet<Integer>();
		    set.add(10);
		    set.add(5);
		    set.add(6);
		    set.add(2);
		    set.add(3);
		    
		    log.info(set.toString());
		
	}

}
