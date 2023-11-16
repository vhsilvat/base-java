package com.example.oppconcepts;

public class AbstractionExample {

	/*
	 * Abstração é um processo de ocultar os detalhes de implementação de uma
	 * classe e, simultaneamente, fornecer recursos essenciais para a utilização
	 * da mesma. Na orientação a objetos, a abstração é obtida através da criação
	 * de interfaces e classes abstratas.
	 */

	/*
	 * INTERFACES SÃO CONTRATOS QUE DEFINEM O COMPORTAMENTO DE MÚLTIPLOS OBJETOS
	 * NÃO RELACIONADOS. É uma concha vazia, por assim dizer.
	 *
	 * Existem apenas assinaturas de métodos nas interfaces.
	 *
	 * Interfaces não podem ser instanciadas e não podem fazer nada se não forem
	 * implementadas, usando pouca memória e CPU.
	 *
	 * Todas as interfaces DEVEM ser PÚBLICAS. Não é possível realizar overloading
	 * (conceito de polimorfismo) em interfaces.
	 */

	public interface Vegetal {
		// Uma interface em Java pode conter variáveis;
		int altura = 10;
		// Uma interface pode conter métodos que devem ser implementados.
		void semear();
		/* Uma interface pode conter métodos static. Esses métodos podem ser
		chamados sem a necessidade da criação de um objeto. Métodos estáticos
		não podem ser sobrescritos (overridden, conceito de polimorfismo) */
		static void morrer() {
			System.out.println("O vegetal morreu.");
		}
		/* Uma interface pode conter métodos default. Esses métodos permitem
		a adição de novos métodos em uma interface sem alterar as outras classes
		que a implementam. Métodos default podem ser sobrescritos (overridden). */
		default void crescer() {
			System.out.println("O vegetal está crescendo.");
		}
	}

	/*
	 * CLASSES ABSTRATAS DEFINEM REGRAS E COMPORTAMENTOS ENTRE MÚLTIPLOS OBJETOS
	 * RELACIONADOS.
	 *
	 * Uma classe abstrata pode conter métodos e variáveis abstratos, como também
	 * métodos ou variáveis concretas.
	 *
	 * Essa classe nunca pode ser instanciada e só pode ser estendida. Objetos de
	 * classes abstratas não podem ser criados. As subclasses de uma classe abstrata
	 * geralmente implementam os métodos abstratos da superclasse.
	 *
	 * Métodos abstratos
	 * só podem ser declarados em uma classe abstrata e não possuem corpo.
	 */

	abstract static class Arvore {
		// Métodos abstratos devem sem implementados nas subclasses.
		public abstract void galhos();
		// Métodos privados não podem ser sobrescritos (overridden).
		void cair() {
			System.out.println("A árvore está caindo");
		}
	}

	static class Jacaranda extends Arvore implements Vegetal {
		// Implementando o método abstrato da superclasse
		@Override
		public void galhos() {
			System.out.println("Jacarandá possui galhos");
		}
		// Implementando o método da interface
		@Override
		public void semear() {
			System.out.println("Jacarandá está semeando");
		}
		// Métodos default da interface podem ser sobrescritos
		@Override
		public void crescer() {
			System.out.println("O Jacarandá está crescendo.");
		}
	}

}
