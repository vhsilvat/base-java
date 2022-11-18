package com.example.oppconcepts;

public class AbstractionExample {

	/*
	 * Abstraction is a process of hiding the implementation details of a class
	 * while providing essential features.
	 */

	/*
	 * The abstract keyword is used to define an abstract class. An abstract
	 * class may contain abstract methods and fields, and may contain
	 * concrete methods or fields.
	 *
	 * This class can never be instantiated and can only be extended.
	 * Objects of abstract classes cannot be created. The subclasses of an
	 * abstract class usually implement the abstract methods of the superclass.
	 *
	 * Abstract methods can only be declared in an abstract class, and they
	 * do not have a body.
	 */

	abstract static class AbstractClassExample {

		abstract void abstractMethod();

		void concreteMethod() {
			System.out.println("Concrete method");
		}
	}

	/*
	 * The abstract class can be extended by a class that implements the abstract
	 * methods of the abstract class.
	 */

	static class AbstractClassExampleImpl extends AbstractClassExample {

		@Override
		void abstractMethod() {
			System.out.println("Abstract method implementation");
		}
	}

	static class RandomClass {
		void soutMethod() {
			System.out.println("Random class");
		}
	}

	public static void main(String[] args) {

		// Although the abstract class appear to be instantiable here, it is
		// a run time anonymous subclass of the abstract class.
		AbstractClassExample a = new AbstractClassExample() {
			@Override
			void abstractMethod() {
				System.out.println("Abstract method from anonymous subclass");
			}
		};

		AbstractClassExampleImpl b = new AbstractClassExampleImpl() {
			@Override
			void abstractMethod() {
				System.out.println("Abstract method from subclass implementation");
			}
		};

		RandomClass c = new RandomClass();

		System.out.println("Name of the anonymous class: " + a.getClass().getName());
		a.abstractMethod();
		a.concreteMethod();

		System.out.println("Name of the subclass implementation: " + b.getClass().getName());
		b.abstractMethod();
		b.concreteMethod();

		// To prove that the other two classes were anonymous subclasses of the abstract superclass
		System.out.println("Name of the random class: " + c.getClass().getName());
	}

}
