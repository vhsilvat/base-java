package com.example.finalkeywords;

public class Finally {

	/*
	 * A palavra-chave finally()é usada para definir um bloco de código a ser executado.
	 * É usada em conjuntos com bloco try-catch e garante que uma seção de código
	 * seja executada, mesmo se uma execução for lançada. Ele executa códigos de limpeza
	 * importantes, como fechar um arquivo, liberar um bloqueio ou fechar um soquete.
	 */

	public static void main(String[] args) {

		try {
			System.out.println("try");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
}
