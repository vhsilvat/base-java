package com.example.finalkeywords;

public class Finalize {

	/*
	 * The finalize() method is called when the garbage collector determines that
	 * an object is no longer in use. It is a destructor method that is called
	 * automatically.
	 */

	static class FinalizeExample {
		@Override
		protected void finalize() throws Throwable {
			System.out.println("Finalize method called");
			super.finalize();
		}
	}

	public static void main(String[] args) {

		FinalizeExample f = new FinalizeExample();
		f = null;
		System.gc();

	}
}
