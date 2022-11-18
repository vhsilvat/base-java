package com.example.oppconcepts;

public class DiamondProblem {

	/*
	 * The diamond problem is a situation in which a class has two or more
	 * interfaces that it implements. The class must implement all the methods
	 * defined in the interfaces.
	 *
	 * It comes with the conflit caused by multiple interfaces having the same
	 * method name and signature.
	 *
	 * DEFAULT METHODS ALLOWS THE ADDITION OF NEW METHODS TO AN INTERFACE 
	 * WITHOUT CHANGING CLASSES THAT IMPLEMENTS THE INTERFACE. This, in turn,
	 * can cause the diamond problem too.
	 *
	 * Whenever we need to add functionality to a legacy interface, we can
	 * use default methods without breaking any implementor classes;
	 */

	public interface interface01 {

		default void defMethod() {
			System.out.println("defMethod01");
		}
	}

	public interface interface02 {

		default void defMethod() {
			System.out.println("defMethod02");
		}
	}

	public static class class01 implements interface01, interface02 {

		/*
		 * We can explicitly implement all the conflicting methods
		 * defined in the interfaces.
		 */
//		@Override
//		public void defMethod() {
//			System.out.println("class01");
//		}

		/*
		 * We can explicitly invoke the default method from the interface
		 */
//		@Override
//		public void defMethod() {
//			interface01.super.defMethod();
//		}

		/*
		 * Futhermore, we can also invoke both the default methods
		 */

		@Override
		public void defMethod() {
			interface01.super.defMethod();
			interface02.super.defMethod();
		}

		/*
		 * We can also invoke the default method from the superclass
		 */
	}

	public static void main(String[] args) {

		class01 c1 = new class01();
		c1.defMethod();
	}
}
