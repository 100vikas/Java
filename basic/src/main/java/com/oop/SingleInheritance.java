package com.oop;

class A1 {

	void m1() {
		System.out.println("hii i am child class");
	}
}


public class SingleInheritance extends A1 {
	public static void main(String[] args) {
		SingleInheritance in = new SingleInheritance();
		in.m1();
	}
}