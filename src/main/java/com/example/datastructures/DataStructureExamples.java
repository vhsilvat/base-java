package com.example.datastructures;

import java.util.*;

public class DataStructureExamples {

	/*
	 * In Linear Data Structures (LDS), elements are arranged in a sequence.
	 * As the elements are organized in a specific sequence, they are easily
	 * accessed by their position.
	 */

	// In arrays, elements are stored in contiguous (adjacent) memory locations.
	ArrayList<String> list = new ArrayList<String>();

	// In stacks, elements are arranged in a LIFO (last-in-first-out) manner.
	// In other words, the last element added to the stack is the first element.
	Stack<String> stack = new Stack<String>();

	// In queues, elements are arranged in a FIFO (first-in-first-out) manner.
	// In other words, the first element added to the queue is the first element.
	AbstractQueue<String> queue;

	// In linked lists, elements are stored as nodes. Each node contains the
	// data and a reference to the next node. Generally, a node is made up of
	// two parts: a data field and a reference to the next node.
	LinkedList<String> linkedList = new LinkedList<String>();


	/*
	 * In Non-Linear Data Structures (NLD), elements are note in any particular
	 * sequence. Rather, they are arranged in a tree-like structure, hierarchically
	 * linked to each other.
	 */

	// Graphs are collections of edges and vertices. They consist of a set of
	// nodes called vertices, and vertices are connected by edges.
	// Java does not provide a default implementation of the Graph data structure.

	// Trees are also collections of edges and vertices, but they allow only one
	// edge between any two vertices.
}
