package com.example.datastructures;

import java.util.*;

public class DataStructureExamples {

	/*
	 * Em Java, estruturas de dados são armazenamentos utilizados para guardar e
	 * organizar dados com eficiência, bem como processá-los e recuperá-los.
	 *
	 * => Data Structures
	 * 		-> Linear Data Structures (LDS)
	 * 			-> Static Data Structure
	 * 				>- Arrays (simple form)
	 * 			-> Dynamic Data Structures
	 * 				>- Queues
	 * 				>- Stacks
	 * 				>- Linked Lists
	 * 		-> Non-linear Data Structures (NDS)
	 * 			>- Trees
	 * 			>- Graphs
	 */

	/*
	 * Em estruturas de dados lineares (LDS), os elementos são organizados em
	 * sequência, portanto, são facilmente acessados pela sua posição (index).
	 */

	// Estruturas de dados estáticas possuem tamanho de memória fixo, destarte, são
	// mais rápidas durante o acesso dos objetos. O único exemplo dessa categoria
	// são os arrays simples.
	int[] num = new int[5]; // array tamanho 5
	int[][] matrix = new int[5][5]; // matriz tamanho 5x5

	// Todos os outros exemplos de LSD tratam-se de estrutruras de dados dinâmicas.
	// Nesse tipo de estrutura o tamanho não é fixo, e pode ser alterado durante
	// runtime da aplicação, o que pode ser considerado eficiente no que se diz respeito
	// à complexidade de memória do código.

	// Nos Arrays (collection framework), objetos são armazenados em locais de memória
	// adjacentes (ou contíguos)
	Collection<Object> colecao = new ArrayList<>();
	List<Object> lista = new ArrayList<>();

	// Nos linked lists, elementos são armazenados em nodos. Cada nodo contém objetos
	// e uma referência para o próximo nodo. Geralmente um nodo é composto de duas
	// partes: um campo de dados e uma referência ao próximo nó.
	List<Object> linkedList = new LinkedList<>();

	// Nos vectors, bem, como nos arrays, objetos são armazenados de forma adjacente,
	// com a diferença de que vectors são sincronizados (thread-safe) e mais lentos.
	List<Object> vector = new Vector<>();

	// Nos stacks, elementos são organizados de maneira LIFO (last in, first out)
	// Em outras palavras, o último elemento adicionado à pilha é removido primeiro.
	List<Object> stack = new Stack<>();

	// Nos queues, elementos são organizados de maneira FIFO (first in, fist out)
	// Em outras palavras, o primeiro elemento adicionado à pilha é removido primeiro.
	Queue<Object> queue = new PriorityQueue<>();

	// Nos deques, elementos são organizados de maneira FIFO (first in, fist out)
	// e LIFO (last in, first out) simultaneamente.
	// Em outras palavras, permite a remoção de objetos em ambas as extremidades.
	Deque<Object> arraydeque = new ArrayDeque<>();
	Deque<Object> linkeddeque = new LinkedList<>();



	/*
	 * Em estruturas de dados não lineares (NLD), os elementos não são armazenados
	 * em nenhuma sequência específica. Ao invés disso, são organizados em uma
	 * estrutura semelhante a uma árvore, hierarquicamente ligados entre si.
	 */

	// Nos HashSets, elementos são armazenados de maneira não ordenada em pares de
	// chave (hash) e valor (objeto). NÃO são permitidos objetos duplicados.
	Set<String> hashSet = new HashSet<>();

	// Nos HashMaps, elementos são armazenados de maneira não ordenada em pares de
	// chave (objeto) e valor (objeto). SÃO permitidos objetos duplicados.
	Map<String, String> hashMap = new HashMap();

	// Nos LinkedHashSets, objetos são armazenados na ordem em que foram inseridos.
	Set<String> linkedHashSet = new LinkedHashSet<>();

	// Nos TreeSets, objetos são armazenados na sua ordem natural (numérica
	// crescente ou alfabética).
	SortedSet<String> treeSet = new TreeSet<>();


}
