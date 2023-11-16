package com.example.solid;

public class SolidPrinciples {

	/*
	 * SOLID PRINCIPLES:
	 *
	 * SOLID é um acrônimo que representa um conjunto de cinco princípios de design
	 * para escrever códigos orientados a objetos de forma escalável. Cada letra
	 * representa um desses princípios:
	 *
	 * S - Princípio da Responsabilidade Única (SRP): Uma classe deve ter apenas uma
	 * razão para mudar, ou seja, deve ter uma única responsabilidade ou tarefa.
	 *
	 * O - Princípio Aberto/Fechado (OCP): Entidades (classes, módulos, funções)
	 * devem estar abertas para extensão, mas fechadas para modificação. Isso
	 * promove o uso de herança, interfaces ou classes abstratas para adicionar
	 * nova funcionalidade em vez de modificar código previamente existente.
	 *
	 * L - Princípio da Substituição de Liskov (LSP): Subclasses devem substituir
	 * suas superclasses sem afetar a correção do programa. Em outras palavras, se
	 * uma classe é subtipo de outra, ela deve ser utilizável no lugar da superclasse
	 * sem problemas.
	 *
	 * I - Princípio da Segregação de Interfaces (ISP): Clientes não devem ser forçados
	 * a depender de interfaces que não utilizam. Esse princípio promove a criação de
	 * interfaces específicas e focadas em vez de interfaces grandes e monolíticas.
	 *
	 * D - Princípio da Inversão de Dependência (DIP): Módulos de alto nível não
	 * devem depender de módulos de baixo nível. Ambos devem depender de abstrações.
	 * Esse princípio incentiva o uso de injeção de dependência e inversão de
	 * controle para desacoplar componentes.
	 *
	 * Estes princípios visam melhorar a manutenibilidade, flexibilidade e robustez
	 * do código, promovendo boas práticas de design orientados a objetos.
	 *
	 *
	 * - Principle of Least Knowledge: A class should only depend on other classes
	 * that it uses.
	 * - Principle of Least Authority: A class should only depend on other classes
	 * that it uses.
	 * - Principle of Least Codding: A class should only depend on other classes
	 * that it uses.
	 */

	// EXEMPLOS:

	/* S - Princípio da Responsabilidade Única (SRP): Uma classe deve ter apenas uma
	razão para mudar, ou seja, deve ter uma única responsabilidade ou tarefa. */
	// Antes da Responsabilidade Única
	static class Relatorios {
		void gerar() { /* gera relatório */ }
		void salvarEmArquivo() { /* salva relatório em arquivo */ }
	}
	// Depois da Responsabilidade Única
	static class Relatorio {
		void gerar() { /* gera relatório */ }
	}
	static class SalvaRelatorio {
		void salvarEmArquivo(Relatorio relatorio) { /* salva relatório em arquivo */ }
	}


	/* O - Princípio Aberto/Fechado (OCP): Entidades (classes, módulos, funções)
	devem estar abertas para extensão, mas fechadas para modificação. Isso promove
	o uso de herança, interfaces ou classes abstratas para adicionar nova
	funcionalidade em vez de modificar código previamente existente. */
	// Antes do Aberto/Fechado
	static class Forma {
		void desenho() { /* desenha forma */ }
	}
	static class Circulo extends Forma {
		void desenho() { /* desenha círculo */ }
	}

	// Depois do Aberto/Fechado
	interface Formas {
		void desenhar();
	}
	static class Circulos implements Formas {
		@Override
		public void desenhar() { /* desenha circulo */ }
	}
	static class Quadrados implements Formas {
		@Override
		public void desenhar() { /* desenha quadrado */ }
	}


	/* L - Princípio da Substituição de Liskov (LSP): Subclasses devem substituir
	suas superclasses sem afetar a correção do programa. Em outras palavras, se
	uma classe é subtipo de outra, ela deve ser utilizável no lugar da superclasse
	sem problemas. */
	// Violação da Substituição de Liskov
	static class Passaro {
		void voar() { /* voa */ }
	}
	static class Galinha extends Passaro {
		void voar() { /* incapaz de voar */ }
	}
	// Adesão à Substituição de Liskov
	interface Ave {
		void mover();
	}
	static class Pardal implements Ave {
		@Override
		public void mover() { /* voa */ }
	}
	static class Pinguim implements Ave {
		@Override
		public void mover() { /* nada */ }
	}


	/* I - Princípio da Segregação de Interfaces (ISP): Clientes não devem ser forçados
	a depender de interfaces que não utilizam. Esse princípio promove a criação de
	interfaces específicas e focadas em vez de interfaces grandes e monolíticas. */
	// Violação da Segregação de Interfaces
	interface Trabalhador {
		void trabalhar();
		void fazerIntervalo();
	}
	static class Pedreiro implements Trabalhador {
		@Override
		public void trabalhar() { /* trabalho de engenharia */ }
		@Override
		public void fazerIntervalo() { /* faz um intervalo */ }
	}
	// Adesão à Segregação de Interfaces
	interface Funcionario {
		void trabalhar();
	}
	interface Intervalos {
		void fazerIntervalo();
	}
	class Engenheiro implements Funcionario, Intervalos {
		@Override
		public void trabalhar() { /* trabalho de engenharia */ }
		@Override
		public void fazerIntervalo() { /* faz um intervalo */ }
	}


	/* D - Princípio da Inversão de Dependência (DIP): Módulos de alto nível não
	devem depender de módulos de baixo nível. Ambos devem depender de abstrações.
	Esse princípio incentiva o uso de injeção de dependência e inversão de
	controle para desacoplar componentes. */
	// Sem Inversão de Dependência
	static class Lampada {
		void ligar() { /* liga luz */ }
		void desligar() { /* desliga luz */ }
	}
	class Interruptor {
		Lampada lampada = new Lampada();
		void operar() {
			if (true /* condição */) {
				lampada.ligar();
			} else {
				lampada.desligar();
			}
		}
	}
	// Com Inversão de Dependência
	interface DispositivoLigavel {
		void ligar();
		void desligar();
	}
	class Luminaria implements DispositivoLigavel {
		@Override
		public void ligar() { /* liga luz */ }
		@Override
		public void desligar() { /* desliga luz */ }
	}
	class Interruptor1 {
		DispositivoLigavel dispositivo;
		Interruptor1(DispositivoLigavel dispositivo) {
			this.dispositivo = dispositivo;
		}
		void operar() {
			if (true /* condição */) {
				dispositivo.ligar();
			} else {
				dispositivo.desligar();
			}
		}
	}
}
