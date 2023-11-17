package com.example.streamtypes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class DifferenceSequentialStreamParallelStream {

	/*
	 * Streams são usados para processar dados de maneira sequencial em coleções
	 * de objetos. Eles são wrappers em torno de fontes de dados, permitindo
	 * processamento complexo, conveniente e eficiente.
	 *
	 * Streams NÃO armazenam dados e, nesse sentido, também não são uma estrutura
	 * de dados. Streams também não alteram os dados originais, mas fornecem o
	 * resultado do processamento dos dados por métodos em pipeline.
	 */

	static class SequentialStreamExample {

		List<String> list = Arrays.asList("hello", "again",
				"v", "i", "c", "t", "o", "r");

	}

	public static void main(String[] args) {

		SequentialStreamExample sequentialStreamExample = new SequentialStreamExample();


		/*
		 * O fluxo sequencial usa uma única thread para processa o pipeline. Qualquer
		 * operação de fluxo sem nome "paralelo" explicitamente é single-thread.
		 *
		 * Objetos de fluxos sequenciais são canalizados em um único fluxo no mesmo
		 * processo, mesmo que o sistema subjacente suporte várias threads.
		 * Consequentemente, ele não se aproveita de sistemas multi-core.
		 */
		sequentialStreamExample.list.stream()
				.filter(s -> s.length() <= 1)
				.forEach(System.out :: println);

		sequentialStreamExample.list.stream()
				.filter(s -> s.length() > 1)
				.map(String :: toUpperCase)
				.sorted()
				.forEach(System.out :: println);

		/*
		 * O fluxo paralelo usa várias threads para processar o pipeline, mesmo que
		 * o programa não use processadores multicore.
		 *
		 * Usando fluxos paralelos, o processamento de dados é dividido em vários
		 * fluxos, processados em núcleos separados pelo processador. O resultado
		 * é a concatenação de todos os fluxos.
		 *
		 * The order of the elements in the stream is not guaranteed. Like other
		 * parallel programs, they are complex and error-prone.
		 */

		sequentialStreamExample.list.parallelStream()
				.filter(s -> s.length() <= 1)
				.forEach(System.out :: println);

		sequentialStreamExample.list.parallelStream()
				.filter(s -> s.length() > 1)
				.map(String :: toUpperCase)
				.sorted()
				.forEach(System.out :: println);
	}
}
