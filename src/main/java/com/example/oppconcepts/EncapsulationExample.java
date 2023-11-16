package com.example.oppconcepts;

public class EncapsulationExample {

	/*
	 * Encapsulamento é o processo de agrupar os dados e métodos para ocultar os
	 * dados armazenados em classes. Isso ajuda a evitar que os dados sejam acessados
	 * ou modificados por outras classes de maneira indesejada. O encapsulamento é
	 * obtido através do uso de modificadores de acesso
	 *
	 * 		- Tornando os campos (parâmetros) privados;
	 * 		- Tornando públicos os métodos getters e setters;
	 * 		- Tornando os métodos privados
	 */

	public static class Pessoa {
		private final String nome;
		private final int idade;

		public Pessoa(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}

		public String getNome() { return nome; }
		public int getIdade() { return idade; }
	}

	public static void main(String[] args) {
		Pessoa person = new Pessoa("John Doe", 30);
		System.out.println("Nome: " + person.getNome());
		System.out.println("Idade: " + person.getIdade());
	}

}
