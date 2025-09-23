package com.oop;

abstract class vehicle {
	abstract void accelerate();

	abstract void brake();

	void startEngine() {
		System.out.println("Switch start");
	}
}

class Car extends vehicle {
	void accelerate() {
		System.out.println("pressing pedal ");
	}

	void brake() {
		System.out.println("press the brake");
	}
	
	void startEngine() {
		super.startEngine();
		System.out.println("Button Press. Current Pass............");
	}
}

public class Abstraction {
	public static void main(String[] args) {

		Car c = new Car();
		c.startEngine();
		c.accelerate();
		c.brake();

	}

}
