package com.example.outputs;

public class ConstructorOutputs {

	/*
	 * Constructor are special methods that are used to initialize the object
	 * of a class. They are automatically called when an object of a class is
	 * created.
	 *
	 * When there's no constructor defined, the runtime enviroment creates a
	 * default constructor with no parameters.
	 */

	static class A {

		public A() {
			this(0);
			System.out.println("A()");
		}

		public A(int x) {
			this(0, 0);
			System.out.println("A(int)");
		}

		public A(int x, int y) {
			System.out.println("A(int, int)");
		}
	}

	public static void main(String[] args) {

		A obj = new A();
	}
}
