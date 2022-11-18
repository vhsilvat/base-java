package com.example.junit;

import org.junit.jupiter.api.Assertions;

public class UnitTests {

	/*
	 * The purpose of mocking is to isolate and focus on the code being
	 * tested and not on the behavior or state of external dependencies.
	 */

	/*
	 * The main objective of unit testing is to ensure that each
	 * individual part is working well and as it’s supposed to work.
	 */

	public void testAdd() {

		// Arrange
		int a = 1
		int b = 2;
		int expected = 3;

		// Act
		int actual = a + b;

		// Assert
		Assertions.assertEquals(expected, actual);
	}

	public static void main(String[] args) {

		UnitTests ut = new UnitTests();
		ut.testAdd();
	}
}
