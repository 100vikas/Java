package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class ConvertIntoArrayToArrayList {

	   private static final Logger log= Logger.getLogger(ConvertIntoArrayToArrayList.class.getName());
	public static void main(String[] args) {
		
		 String[] array = {"Red", "Green", "Blue"};		        
		  
//		 log.info(Arrays.toString(array));
		 for(int i=0;i<array.length;i++) {	
			 log.info(array[i]);
			 
		 }
		  
		  List<String>convertinarraylist=new ArrayList<String>(Arrays.asList(array));   // convert  array to arrylist
		  log.info(convertinarraylist.toString());
		
	}
}
