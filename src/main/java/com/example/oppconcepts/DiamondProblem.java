package com.example.oppconcepts;

public class DiamondProblem {

	/*
	 * O problema diamante é uma situação em que uma classe possui duas ou mais
	 * interfaces implementadas. A classe deve implementar todos os métodos
	 * definidos nas interfaces.
	 *
	 * O conflito ocorre quando múltiplas interfaces possuem os mesmos nomes de
	 * métodos com as mesmas assinaturas.
	 *
	 * Métodos default permitem a adição de novos métodos em uma interface sem
	 * alterar as classes que a implementam. Isso, por sua vez, também pode causar
	 * o problema diamante.
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
		 * Podemos implementar explicitamente todos os métodos conflitantes definidos
		 * nas interfaces
		 */
//		@Override
//		public void defMethod() {
//			System.out.println("class01");
//		}

		/*
		 * Podemos invocar explicitamente o método padrão da interface
		 */
//		@Override
//		public void defMethod() {
//			interface01.super.defMethod();
//		}

		/*
		 * Além disso, podemos também invocar ambos os métodos default ao mesmo tempo
		 */
		@Override
		public void defMethod() {
			interface01.super.defMethod();
			interface02.super.defMethod();
		}
	}

	public static void main(String[] args) {

		class01 c1 = new class01();
		c1.defMethod();
	}
}
