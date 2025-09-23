package com.constructor;

public class Constructor {
	   
//	default constructor;
	Constructor(){                                //  criating cunstructor;
		System.out.println("i am constructor");
		}
	
// parameter cunstructor ;	
	int id;
	String name;
	Constructor(int id,String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
	         new  Constructor(); 
		Constructor d=new Constructor(10,"vikas");
		System.out.println(d.id);
		System.out.println(d.name);
		
		
	}

}
