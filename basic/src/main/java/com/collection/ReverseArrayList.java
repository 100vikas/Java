package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ReverseArrayList{
	private static final Logger logger=Logger.getLogger(ReverseArrayList.class.getName());
public static void main(String[] args) {
	List<String>str=new ArrayList<>();
	    str.add("banana");
	    str.add("mango");
	    str.add("orange");
	    str.add("apple");   
	    logger.info(str.toString());
 //      System.out.println(str.reversed());       // ths method  used to reverse list
	    for(int i=str.size()-1;i>=0;i--) {
//	    	System.out.println(str.get(i));
	    	logger.info(str.get(i));
	    }
}
}
