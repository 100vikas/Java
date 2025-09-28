package com.oop;

import java.lang.reflect.Constructor;

public class Cunstuctor  {
	
	 public static void main(String[] args) throws Exception  {
		 


        Constructor<B> constructor = B.class.getDeclaredConstructor();
        constructor.setAccessible(true); // Bypass private access
        B obj = constructor.newInstance();
    }
}

class B{
	  private B() {
	    System.out.println("hii hello ");
}

//B(int a){
//	
//	System.out.println(a);
//}
	
}
