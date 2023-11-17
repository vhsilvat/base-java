package com.example.finalkeywords;

// Classes finais não podem ser herdadas ou estendidas.
public final class Final {

	// Variáveis finais não podem ser reatribuídas.
	final int x = 10;
	// x = 20; // Compile error

	// Métodos finais não podem ser sobrescritos (overridden).
	public final void print() {
		System.out.println("x = " + x);
	}

	/*
	 * IMUTABILIDADE x acesso FINAL
	 * - Numa classe FINAL ainda é possível alterar algum atributo por um setter,
	 * ao passo que numa classe IMUTÁVEL o valor dos objetos não podem ser alterados.
	 *
	 * - O modificador FINAL é aplicável para variáveis, mas não para objetos.
	 * A IMUTABILIDADE é aplicavel para um objeto, mas não para variáveis.
	 */

	public final class PessoaImutavel {
		private final String nome;
		private final int idade;
		public PessoaImutavel(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}
		public String getNome() {
			return nome;
		}
		public int getIdade() {
			return idade;
		}
	}
}
