package com.example.finalkeywords;

// Final classes cannot be subclassed or extended.
public final class Final {

	// Final variables cannot be reassigned.
	final int x = 10;
	// x = 20; // Compile error

	// Final methods cannot be overridden.
	public final void print() {
		System.out.println("x = " + x);
	}

	/*
	 * The final keyword is used in multiples contexts to define an entity.
	 */
}
