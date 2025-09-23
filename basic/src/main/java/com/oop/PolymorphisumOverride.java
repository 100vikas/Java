package com.oop;


class Demo {
	
	void m1(int id) {
		System.out.println("hii :" + id);

	}
   
}

class Demo2 extends Demo {
	void m1(int id) {
		super.m1(id);
		System.out.println("hello :" + id);
	}

}

public class PolymorphisumOverride {
	public static void main(String[] args) {
//		Demo2 demo = new Demo2();
//		demo.m1(1);
		Demo d=new Demo2();
		 d.m1(1);
		
		
	}

}
