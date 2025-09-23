package com.oop;

class X {
	int a = 10;
}

class Y extends X{
	int b = 20;
}

class Z  extends Y{
	int c = 30;
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		Z z = new Z();
		
		System.out.println(z.a);
		System.out.println(z.b);
		System.out.println(z.c);
	}
}