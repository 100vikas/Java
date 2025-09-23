package com.oop;


 class Main{
	int id;
	String name;
	
	public void student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	  
	
}
 class Dog{
	 int age;
	 String name;
	 String color;
	 public Dog(int age,String name,String color) {
		 this.age=age;
		 this.name=name;
		 this.color=color;
		 
	 }
	  public int getAge() {
		  return age;
	  }
	  public String getName() {
		  return name;  
	  }
	  public String getColor() {
		  return color;
	  }
	  public String doginfo() {
		  return ( " name is :"+this.name
		  		+ " \n age is :"+this.getAge()+" \n color is :"+this.color);
	  }
 }
 
 class UsingSateAndGet{
	 int id;
	 String name;
	 public void set(int id,String name) {
		 this.id=id;
		 this.name=name;
	 }
	 public void get() {
		 System.out.println(this.id);
		 System.out.println(this.name);
	 }
 }
public class classAndObject {

	public static void main(String[] args) {
	
		Main m=new Main();
		m.student(1,"vikas");
	    System.out.println(m.id);
	    System.out.println(m.name);
	    
	    Dog dog=new Dog(2,"tommy","black");
	     System.out.println(dog.doginfo());
//	    System.out.println("age is : "+dog.age);
	     
	     UsingSateAndGet setget=new UsingSateAndGet ();
	         setget.set(3, "ravi");
	         setget.get();
	    
		}
		 
	
	

}
