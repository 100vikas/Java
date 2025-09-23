package com.constructor;
class CopyConsrtuctor{
	int id;
	String name;
	CopyConsrtuctor(int id,String name){
		this.id=id;
		this.name=name;	
	}
	CopyConsrtuctor(CopyConsrtuctor obj1){
		this.id=obj1.id;
		this.name=obj1.name;
	}
	public static void main(String[] args) {
		CopyConsrtuctor     c= new CopyConsrtuctor(1,"vikas"); 
		      System.out.println(c.id);
		      System.out.println(c.name);
		      
		 CopyConsrtuctor  copy=new CopyConsrtuctor(c);           // this is a copy constructor
		 System.out.println(copy.id);
		 System.out.println(copy.name);
		     
	
	}
}