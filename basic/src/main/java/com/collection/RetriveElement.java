package com.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class RetriveElement {
	private static final Logger log=Logger.getLogger(RetriveElement.class.getName());
	  public static void main(String[] args) {
		     List<Integer>list=new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		         for(int i=0;i<list.size();i++) {
		        	 log.info(list.get(i).toString()); 
		         }     	 	
	}

} 
