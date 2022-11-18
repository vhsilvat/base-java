package com.example.algorithms;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Hello World";
		StringBuilder sb = new StringBuilder();

		sb.append(str);
		sb.reverse();

		System.out.println(sb.toString());
	}
}
