package com.example.datastructures;

public class JavaCollectionsFramework {

	DataStructureExamples examples = new DataStructureExamples();

	/*
	 * O Java Collections Framework fornece um conjunto de classes e interfaces
	 * para implementar estruturas de dados e algoritmos comumente reutilizáveis.
	 * Este framework funciona mais como uma biblioteca do que como um framework
	 * propriamente dito. Ele fornece um conjunto de classes e interfaces que podem
	 * ser usadas por outras classes.
	 *
	 * A interface "iterable" permite o acesso aos elementos de uma coleção um por
	 * vez, sequencialmente, do início ao fim. São chamados de estruturas de dados
	 * lineares (LDS), onde os elementos são facilmente acessados pela sua posição
	 * (também chamado de index).
	 *
	 * => (i) Iterable -> (i) Collection
	 * 		-> (i) List
	 * 			>- (c) ArrayList
	 * 			>- (c) LinkedList
	 * 			>- (c) Vector
	 * 				-> (c) Stack
	 *      -> (i) Queue						LEGENDA:
	 *          >- (c) PriorityQueue			-> implements
	 * 			-> (i) Deque					>- extends
	 * 				>- (c) ArrayDeque
	 * 				>- (c) LinkedList
	 *      -> (i) Set
	 *          >- (c) HashSet
	 *          >- (c) LinkedHashSet
	 *          -> (i) SortedSet
	 *              >- (c) TreeSet
	 *
	 * A interface "map" mapeia e armazena dados em pares de chaves (hashes) e valor,
	 * onde uma chave é um objeto usado para acessar posteriormente o valor. As chaves
	 * são exclusivas e não podem ser duplicadas, desta forma, cada dado no mapa possui
	 * sua chave e valor correspondente. Um mapa não pode ser iterado, pois os
	 * elementos não são armazenados em nenhuma sequência específica, portanto são
	 * chamados de estruturas de dados não lineares (NLD).
	 *
	 * => (i) Map
	 * 		>- HashTable
	 * 		>- HashMap							LEGENDA:
	 * 		>- LinkedHashMap					-> implements
	 * 		-> SortedMap						>- extends
	 * 			-> (c) TreeMap
	 *
	 *
	 * DEFINIÇÕES:
	 * === Collection -> 	qualquer grupo de objetos individuais representados como
	 * 						uma única unidade é conhecido como coleção de objetos.
	 *
	 *
	 * === List ->		armazena colletions de forma ordenada, permitindo assim a
	 * 					recuperação e inserção posicional de elementos. Permite também
	 * 					o armazenamento de elementos duplicados.
	 *
	 * == ArrayList ->	não necessita declaração de tamanho; velocidade na recuperação
	 * 					e modificação de elementos através do índice; lentidão na
	 * 					inserção ou remoção de dados, pois todos os outros índices
	 * 					precisam ser 'shifitados'. Pode armazenar valores nulos.
	 * 					NÃO é thread-safe (dessincronizado, múltiplas threads podem
	 * 					acessar e corromper os dados).
	 *
	 * == LinkedList -> 	não necessita declaração de tamanho; lento na recuperação e
	 * 						modificação de elementos, pois precisa percorrer todos os
	 * 						nodos; rápido na inserção e remoção de dados, pois só é
	 * 						necessário alterar os apontadores dos elementos. Funciona
	 * 						tanto como lista quanto fila. Geralmente é mais eficiente
	 * 						em operações que ocorrem no meio da lista (ou fila).
	 * 						Aceita valores nulos.
	 *
	 * == Vector ->		não necessita declaração de tamanho; é similar ao ArrayList,
	 * 					porém é sincronizado (portanto, é thread-safe). É mais lento
	 * 					que o ArrayList devido à sincronização. Trata-se de uma
	 * 					implementação legada, portanto não se recomenda a utilização.
	 *
	 * == Stack ->		baseado no princípio LIFO (last in, first out); implementa
	 * 					a classe Vector, portanto, é sincronizada (thread-safe);
	 * 					recomenda-se a utilização da ArrayDeque.
	 *
	 * === Queue -> 	interface que utiliza o princípio FIFO (first in, first out)
	 * 					para armazenar elementos. Sua utilização se limita à inserção
	 * 					de objetos no final da lista e exclusão de elementos no início
	 * 					da lista. Todas as suas implementações são dessincronizadas
	 * 					(NÂO são thread-safe).
	 *
	 * == PriorityQueue -> 	armazena objetos em ordem natural (numérica crescente ou
	 * 						alfabética, por exemplo) ou por um custom Comparator
	 * 						fornecido no momento da construção da queue. Não permite
	 * 						valores nulos. Objetos armazenados no PriorityQueue devem
	 * 						implementar a interface Comparable.
	 *
	 * === Deque -> 	sub-interface que implementa a Queue e a estende para fornecer
	 * 					uma fila dupla, ou seja: funciona como uma fila (FIFO) ou como
	 * 					uma pilha (LIFO). Permite a adição e remoção de elementos em
	 * 					ambas as extremidades da Queue.
	 *
	 * == ArrayDeque ->		alternativa mais eficiente à Stack, permite inserção e
	 * 						remoção de elementos em ambas as extremidades da fila
	 * 						com desempenho constante e rápido nesse tipo de cenário.
	 * 						É mais rápida que o LinkedList quando usada como fila, em
	 * 						cenários onde a maioria das operações são nas extremidades.
	 * 						É dessincronizada (NÃO thread-safe), não aceita nulos.
	 *
	 * === Set ->		armazena collections de forma não ordenada, e não aceita a
	 * 					inserção de elementos duplicados (comparáveis através do hash).
	 *
	 * == HashSet ->	é uma classe que implementa a interface set apoiada sobre
	 * 					um hash table. Não existe ordem de iteração quanto aos
	 * 					conjuntos hash; apenas um objeto pode ser nulo, no entanto,
	 * 					valores repetidos NÃO são aceitos (pois implementa set).
	 *
	 * == LinkedHashSet -> 	versão ordenada do HashSet que mantém links duplamente
	 * 						vinculados em todos os elementos. Objetos são retornados
	 * 						na ordem em que foram inseridos.
	 *
	 * === SortedSet -> armazena collections de forma ordenada natural (numérica
	 * 					crescente ou alfabética, por exemplo). Objetos armazenados
	 * 					no SortedSet devem implementar a interface Comparable.
	 *
	 * == TreeSet -> 	implementação mais importante da interface SortedSet, armazena
	 * 					elementos em ordem natural independentemente de um comparador
	 * 					explícito. São excelentes para armazenar abundantes quantidades
	 * 					de informação classificadas que devem recuperadas rapidamente.
	 * 					Não aceita valores nulos, pois precisa comparar valores na
	 * 					remoção de dados.
	 *
	 * === Map -> 		possui chaves exclusivas e não armazena dados em nenhuma ordem.
	 * 					São perfeitos para associações de valores-chave, como dicionários,
	 * 					quando necessário recuperar ou atualizar elementos por chaves.
	 * 					Exemplos: códigos de erros e descrições; códigos postais e cidades;
	 * 					gerentes e funcionários; turmas e alunos, etc.
	 *
	 * == Hashtable ->	implementa uma tabela hash, mapeando chaves e valores, e estende
	 * 					a classe abstrata Dictionary. Qualquer objeto pode ser usado
	 * 					como chave ou como valor, no entanto, os objetos usados como
	 * 					chave devem implementar os métodos hashCode() e equals().
	 * 					Hashtable é sincronizada (portanto, é thread-safe) e por isso
	 * 					tem desempenho mais lendo que a implementação HashMap.
	 *
	 * == HashMap -> 	similar ao hashtable, armazena dados em pares (chave-valor).
	 * 					Permite objetos duplicados, mas não chaves duplicadas. Se uma
	 * 					chave duplicada for adicionada, o valor anterior associado à
	 * 					chave será substituído. Suporta UMA chave nula e vários objetos
	 * 					nulos se necessário. É dessincronizado (NÃO é thread-safe),
	 * 					portanto é mais rápido na recuperação de dados.
	 *
	 * == LinkedHashMap -> 	igual ao HashMap, com o recurso adicional de mater uma
	 * 						ordem de inserção dos elementos inseridos nela.
	 *
	 * === SortedMap ->	implementa map, porém ordena as chaves em ordem natural
	 * 					(numérica crescente ou alfabética, por exemplo). Objetos
	 * 					armazenados no SortedMap devem implementar a interface
	 * 					Comparable.
	 *
	 * == TreeMap -> 	classifica objetos conforme a ordem natural de suas chaves ou
	 * 					por um comparador fornecido no momento da criação do mapa.
	 *					É dessincronizado (NÃO é thread-safe)
	 *
	 */

}
