package com.example.oppconcepts;

public class PolymorphismExample {

	/*
	 * Polimorfismo é a capacidade de um objeto, variável ou método assumir muitas
	 * formas. Em Java, polimorfismo é alcançado por meio overloading um método ou
	 * overriding um método.
	 *
	 * Method overloading ocorre quando uma classe possui vários métodos com o mesmo
	 * nome, mas com parâmetros (assinatura) diferente. O overloading acontece
	 * durante RUN TIME.
	 *
	 * Method overriding ocorre quando uma subclasse fornece sua própria implementação
	 * de um método já definido na superclasse. O overriding acontece durante o
	 * compile time.
	 * Compile time polymorphism is the ability of an object to take on many
	 * forms at compile time. It's linked with the concept of OVERLOADING.
	 */

	static class Animal {
		void fazBarulho() {
			System.out.println("O animal faz barulho.");
		}

		// Overloading: mesmo nome, parâmetros diferentes (assinatura)
		void fazBarulho(String sound) {
			System.out.println("O animal faz o barulho: " + sound);
		}
	}

	static class Cachorro extends Animal {
		@Override
		void fazBarulho() {
			System.out.println("O cachorro late.");
		}

		@Override
			// Overriding: mesma assinatura, implementação diferente
		void fazBarulho(String sound) {
			System.out.println("O cachorro faz o barulho: " + sound);
		}
	}

	public static void main(String[] args) {
		Animal animal1 = new Cachorro();
		Animal animal2 = new Animal();

		animal1.fazBarulho();				// Output: O cachorro late.
		animal1.fazBarulho("Woof!");	// Output: O cachorro faz o barulho: Woof!
		animal2.fazBarulho();				// Output: O animal faz barulho.
		animal2.fazBarulho("Meow!");	// Output: O animal faz o barulho: Meow!
	}

}
