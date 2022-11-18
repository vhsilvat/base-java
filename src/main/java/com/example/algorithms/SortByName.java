package com.example.algorithms;

import java.util.ArrayList;
import java.util.Comparator;

public class SortByName {

	static class Person {

		private String firstName;
		private String lastName;

		Person(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public String getLastName() {
			return lastName;
		}

		public String getFirstName() {
			return firstName;
		}
	}

	public static void main(String[] args) {

		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person("John", "Doe"));
		persons.add(new Person("Jane", "Doe"));
		persons.add(new Person("John", "Smith"));
		persons.add(new Person("Victor", "Hugo"));
		persons.add(new Person("Adriana", "Candido"));
		persons.add(new Person("Maria", "Cristina"));
		persons.add(new Person("Marcia", "Monica"));

		// Sort by last name
		System.out.println("\nSorted by last name:");
		persons.sort(Comparator.comparing(Person :: getLastName));
		for (Person person : persons) {
			System.out.println(person.getLastName());
		}

		// Sort by first name
		System.out.println("\nSorted by first name:");
		persons.sort(Comparator.comparing(Person :: getFirstName));
		for (Person person : persons) {
			System.out.println(person.getFirstName());
		}

	}

}
