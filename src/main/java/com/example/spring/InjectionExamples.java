package com.example.spring;

public class InjectionExamples {

	static class Employee {

		int id;
		String name;
		Adress adress;

		// HIGH DEPENDENCY AND CODE COUPLING
		Employee() {
			id = 0;
			name = "Foo";
			adress = new Adress();
		}

		// LOW DEPENDENCY AND CODE COUPLING
		Employee(Adress adress) {
			id = 0;
			name = "Foo";
			this.adress = adress;
		}

		void setAdress(Adress adress) {
			this.adress = adress;
		}
	}

	static class Adress {
		String street;
		String city;
		String state;
		String zip;
	}

	public static void main(String[] args) {

		// Dependency Injection
		// Better for many dependencies
		Adress adress = new Adress();
		Employee emp = new Employee(adress);

		// Setter Injection
		// Better for few dependencies
		Employee e = new Employee();
		e.setAdress(adress);

		/*
		 * Autowiring in Spring allows injection of beans automatically.
		 */
	}
}
