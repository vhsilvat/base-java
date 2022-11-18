package com.example.javacore;

public class StaticKeyword {

	/*
	 * The static keyword means that the particular member belongs to the class
	 * itself and not to any object of the class.
	 */

	/*
	 * Static nested classes behave exactly like any other top-level class, but
	 * are enclosed in the only class that will access it, to provide better
	 * packaging convenience.
	 *
	 * Static classes only have access to the static members of the outer class.
	 */
	public static class Car {
		private String name;
		private String engine;

		/*
		 * When a field is declared static, a single copy of that field is created
		 * and shared by all the instances of the class.
		 * We can only declare static variables at the class level.
		 */
		public static int numberOfCars;

		public Car(String name, String engine) {
			this.name = name;
			this.engine = engine;
			numberOfCars++;
		}

		/*
		 * Static methods can be called without creating an object of the class
		 * and are commonly used to create utility methods. It can acess and
		 * manipulate static fields.
		 *
		 * Used when the value of the variable is independent of the object
		 * and when the value of the variable is supposed to be shared by all
		 * the objects of the class.
		 */
		public static void setNumberOfCars(int numberOfCars) {
			Car.numberOfCars = numberOfCars;
		}
	}

	public static void main(String[] args) {

		Car car1 = new Car("BMW", "V8");
		Car car2 = new Car("Audi", "V6");
		Car car3 = new Car("Mercedes", "V8");
		// We can acess static fields without object initialization
		// using object reference as below.
		System.out.println("Number of cars: " + Car.numberOfCars);

		Car.setNumberOfCars(10);
		System.out.println("Number of cars: " + Car.numberOfCars);
	}
}
