package com.example.oppconcepts;

public class InheritanceExample {

	/*
	 * Herança é um mecanismo no qual uma classe adquire as propriedades de outra
	 * classe. Isto é conseguido através do uso da palavra-chave "extends".
	 *
	 * Isso permite a reutilização de código, declarando características comuns
	 * entre as subclasses herdadoras promovendo assim a modularidade do código, bem
	 * como ajudando a criar uma estrutura hierárquica entre classes.
	 *
	 * A herança é uma espécie de polimorfismo.
	 */

	public static class Animal {
		protected String especies;

		public Animal(String especies) { this.especies = especies; }

		public void fazBarulho() {
			System.out.println("O " + especies + " faz barulho.");
		}
	}

	public static class Cachorro extends Animal {
		public Cachorro() { super("cachorro doméstico"); }

		public void balancaRabo() {
			System.out.println("O cachorro balança o rabo.");
		}
	}

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.fazBarulho(); // Output: O cachorro doméstico faz barulho.
		cachorro.balancaRabo();  // Output: O cachorro balança o rabo.
	}
}
