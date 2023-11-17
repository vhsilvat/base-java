package com.example.finalkeywords;

public class Finalize {

	/*
	 * O método finalize() é chamado quando o coletor de lixo determina que um objeto
	 * não está mais em uso. É um método destruidor chamado automaticamente.
	 * Apesar de ser possível chamar o método, é recomendado deixar com que o próprio
	 * Java se encarregue de chamar o GC para limpar objetos não mais utilizados.
	 */

	static class FinalizeExample {
		@Override
		protected void finalize() throws Throwable {
			System.out.println("Finalize method called");
			super.finalize();
		}
	}

	public static void main(String[] args) {

		FinalizeExample f = new FinalizeExample();
		f = null;
		System.gc();

	}
}
