package com.example.datastructures;

import java.util.ArrayList;

public class StackArrayImplementation {

	/*
	 * Stack is a type of linear data structure that follows the LIFO (Last In,
	 * First Out) principle. Insert and delete operations are performed at the
	 * end (top) of the structure. Inserting and deleting elements is called
	 * pushing and popping.
	 */

	static class Stack<T> {

		ArrayList<T> A;
		int top = -1;
		int size;

		Stack(int size) {
			this.size = size;
			A = new ArrayList<T>(size);
		}

		void push(T x) {

			if (top + 1 == size) {
				System.out.println("Stack overflow");
			} else {
				top = top + 1;
				if (A.size() > top) {
					A.set(top, x);
				} else {
					A.add(x);
				}
			}
		}

		T pop() {

			if (top == -1) {
				System.out.println("Stack underflow");
				return null;
			} else {
				T x = A.get(top);
				top = top - 1;
				return x;
			}
		}
	}
}
