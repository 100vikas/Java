package com.oop;


class A{
	private void m1() {
		System.out.println("hii");
	}
	protected void m2() {
		System.out.println("tis is protected");
	}
	
}
public class AccessModifire {
  public static void main(String[] args) {
	A a=new A();
//      a.m1();                           // not access becouse method is private 
	    a.m2();                           // access becouse method is protected
}
}
