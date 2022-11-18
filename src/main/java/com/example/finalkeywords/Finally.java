package com.example.finalkeywords;

public class Finally {

	/*
	 * The finally keyword is used to define a block of code to be executed,
	 * Is used in conjunction with try-catch blocks and ensures that a section
	 * of code is executed, even if an exception is thrown. It executes important
	 * cleanup code, such as closing a file, releasing a lock, or closing a socket.
	 */

	public static void main(String[] args) {

		try {
			System.out.println("try");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
}
