package com.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class FindTheNthElement {
	private static final Logger log=Logger.getLogger(FindTheNthElement.class.getName());
	public static void main(String[] args) {
		
		List<String>str=new LinkedList<String>();
		   str.add("A");
		   str.add("B");
		   str.add("C");
		   str.add("D");
		   str.add("e");
		   str.add("m");
		   log.info(str.toString());
		   int n=0;
		   
		   if(n>0 && n<=str.size()) {
			  
			   log.info(str.get(str.size()-n));                   // 6-3=3    
			  
		   }
		   else {
			   log.info("invalid n value");
		   }
		   

	}

}
