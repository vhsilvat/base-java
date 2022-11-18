package com.example.oppconcepts;

public class PolymorphismExample {

	/*
	 * Polymorphism is the ability of an object, variable or method to take on many forms.
	 * Runtime polymorphism is the ability of an object to take on many forms at
	 * run time. It's linked with the concept of overriding.
	 * Overriding is the process of defining a method in a subclass that provides
	 * a specific implementation of the method declared in the superclass.
	 *
	 * Compile time polymorphism is the ability of an object to take on many
	 * forms at compile time. It's linked with the concept of OVERLOADING.
	 */

	static abstract class Shape {

		int size;

		void draw() {
			System.out.println("Drawing a shape");
		};

		// OVERLOAD EXAMPLE
		// The overloaded method not necessarily needs to be inherited.
		void draw(int size) {
			System.out.println("Drawing a shape with size " + size);
		};


		// If there is no implementation of the abstract method, then the
		// compiler will throw an error.
		// The abstract method MUST be implemented (overrided) in the subclasses.
		abstract void paint();
	}

	// The object of the superclass Shape is constructed by the runtime environment.
	static class Circle extends Shape { // Object to object inheritance

		// Overriding the draw method from the superclass
		@Override
		void draw() {
			System.out.println("Drawing a circle");
		}

		// Overriding and implementing the paint method from the superclass
		@Override
		void paint() {
			System.out.println("Painting a circle");
		}
	}

	static class Rectangle extends Shape {

		@Override
		void draw() {
			System.out.println("Drawing a rectangle");
		}

		@Override
		void paint() {
			System.out.println("Painting a rectangle");
		}
	}

	public static void main(String[] args) {

		Shape s;

		/*
		 * Example of runtime polymorphism:
		 * Overridden methods "changes" the superclass method.
		 * It must have the same signature as the superclass method.
		 */

		// Reference variable of type Shape, but it is an object of type Circle.
		s = new Circle(); // This is called polymorphic statement.
		s.draw();
		s.paint();

		// Reassign the reference variable "s" to reference an object of type Rectangle
		// using the same method.
		s = new Rectangle();
		// Drawing different shapes dynamically at runtime.
		s.draw(); // This is a runtime polymorphism, or upcasting.
		s.paint();

		/*
		 * Example of compile time polymorphism.
		 */

		s = new Shape() {
			@Override
			void paint() {
				System.out.println("Painting a shape");
			}
		};

		s.draw();
		s.draw(2);

	}
}
