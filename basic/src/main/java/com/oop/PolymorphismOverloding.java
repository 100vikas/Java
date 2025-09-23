package com.oop;

//OVERLODING POLYMOROPHISM

class parent {
	int id;
	String name;

	void m1(int id, String name) {
		this.id = id;
		this.name = name;

	}

	void m1(int id) {
		System.out.println("hii hello" + id);

	}

	void m1() {
		System.out.println(id);
		System.out.println(name);
	}

}

class Child extends parent {

}

public class PolymorphismOverloding {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.m1(1, "vikas");
		ch.m1();
		ch.m1(1);

	}

}
