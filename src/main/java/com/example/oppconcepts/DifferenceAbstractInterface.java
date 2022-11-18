package com.example.oppconcepts;

public class DifferenceAbstractInterface {

	/*
	 * An INTERFACE is a contract that defines the behavior of a class. It is a
	 * empty shell so to speak. There are only signatures of the methods in the
	 * interface. The interface itself cannot be instantiated and cannot do anything
	 * if it is not implemented, so it uses little memory and CPU.
	 *
	 * All classes and fields in the interface MUST be public.
	 *
	 * INTERFACES ARE CONTRACTS WITH RULES IMPLEMENTED BY MULTIPLE UNRELATED OBJECTS.
	 * It's not possible to overload methods in an interface.
	 */

	public interface Vegetable {

		// An interface can have fields.
		int height = 10;

		// An interface can have methods which has to be implemented.
		void seed();

		// An interface can have static methods.
		// Static methods cannot be overridden.
		// Static methods are called without creating an object.
		static void die() {
			System.out.println("Vegetable is dying");
		}

		// An interface can have default methods.
		// IT ALLOWS THE ADDITION OF NEW METHODS TO AN INTERFACE WITHOUT CHANGING
		// CLASSES THAT IMPLEMENTS THE INTERFACE.
		// Default methods can be overridden.
		default void grow() {
			System.out.println("Vegetable is growing");
		}
	}

	 /*
	  * An ABSTRACT CLASS is a class that may contain abstract methods and fields,
	  * and may contain concrete methods or fields.
	  * Before the construction of the child object, the parent object is constructed
	  * by the runtime environment, which in turn uses more memory and CPU.
	  *
	  * Abstract classes can have any visibility modifiers.
	  *
	  * ABSTRACT CLASSES ARE PARENTS WITH RULES OR BEHAVIOURS AMONG MULTIPLES RELATED OBJECTS.
	  */

	abstract static class Tree {

		// Abstract methods must be implemented in the subclasses.
		protected abstract void branches();

		// Private fields cannot be overridden.
		private void fall() {
			System.out.println("Tree is falling");
		}
	}

	static class OakTree extends Tree implements Vegetable {

		// Overriding the abstract method from the superclass
		@Override
		protected void branches() {
			System.out.println("OakTree has branches");
		}

		@Override
		public void seed() {
			System.out.println("OakTree is seeding");
		}

		// Default methods from the interface can be overridden.
		@Override
		public void grow() {
			System.out.println("OakTree is growing");
		}

	}

	public static void main(String[] args) {

		OakTree oak = new OakTree();
		oak.grow();
		oak.branches();
		oak.seed();

		// oak.fall(); // Compiler error: Cannot access a private field.
//		oak.fall();
	}
}
