package com.oop;

public class Encapsulation {
	private int id;
	private String name;

	void setId(int id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	
	public static void main(String[] args) {

		Encapsulation e = new Encapsulation();
		e.setId(1);
		e.setName("vikas");
		System.out.println("id is :" + e.getId());
		System.out.println("name is :" + e.getName());
	}

}
