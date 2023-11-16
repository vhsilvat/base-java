package com.example.spring;

public class IoCExplanation {

	/*
	 * O QUE É INVERSÃO DE CONTROLE?
	 * Refere-se à transferência do controle de objetos e suas
	 * dependências do cliente (programa principal) para o contâiner ou framework. É
	 * um princípio de design, não um padrão de design ou um recurso de linguagem de
	 * programação.
	 *
	 * Spring framework é um exemplo de contâiner IoC que gerencia o ciclo de vida de
	 * objetos e suas dependências por meio de anotações ou código Java.
	 *
	 * O QUE É INJEÇÃO DE DEPENDÊNCIA?
	 * Trata-se de um princípio de design (parte do SOLID) que nos permite dissociar
	 * as dependências de uma classe da própria classe. É uma espécie de implementação
	 * do conceito IoC.
	 *
	 * COMO FUNCIONA?
	 * Ao invés de criar objetos dentro de outro objeto com a palavra-chave new, podemos
	 * injetar um objeto através do construtor de outra classe ou método setter.
	 *
	 * POR QUE PRECISAMOS DA INVERSÃO DE CONTROLE?
	 * Reduz e simplifica o código, torna o código mais legível e de fácil manutenção
	 * e torna o código mais testável (porque separa as dependências do código).
	 */

	static class Funcionario {

		int id;
		String nome;
		Endereco endereco;

		// ALTA DEPENDÊNCIA E ACOPLAMENTO DE CÓDIGO
		Funcionario() {
			id = 0;
			nome = "Foo";
			endereco = new Endereco();
		}

		// BAIXA DEPENDÊNCIA E ACOPLAMENTO DE CÓDIGO
		Funcionario(Endereco endereco) {
			id = 0;
			nome = "Foo";
			this.endereco = endereco;
		}

		void setAdress(Endereco endereco) {
			this.endereco = endereco;
		}
	}

	static class Endereco {
		String rua;
		String cidade;
		String estado;
		String cep;
	}

	public static void main(String[] args) {

		// Injeção de dependência
		// Melhor para lidar com muitas dependências
		Endereco endereco = new Endereco();
		Funcionario emp = new Funcionario(endereco);

		// Injeção do setter
		// Melhor para lidar com poucas dependências
		Funcionario func = new Funcionario();
		func.setAdress(endereco);

		/*
		 * Autowiring no spring permite a injeção de beans automaticamente.
		 */
	}
}
