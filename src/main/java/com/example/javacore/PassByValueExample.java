package com.example.javacore;

public class PassByValueExample {

	/*
	 * The pass by value example shows how the value of an object
	 * is passed to a method.
	 *
	 * Java strictly follows the pass by value principle, so the
	 * original value of an object or parameter is not changed.
	 */

	public static void processData(int x) {

		x = 20;
		System.out.println("inside processData: x = " + x);
	}

	public static void main(String[] args) {

		int x = 10;
		System.out.println("before call-by-value: x = " + x);

		processData(x);
		System.out.println("after call-by-value: x = " + x);
	}
}
