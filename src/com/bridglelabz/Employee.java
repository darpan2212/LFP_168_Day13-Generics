package com.bridglelabz;

public class Employee implements Comparable<Employee> {

	String name;
	int age;
	int salary;

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Elon";
		e1.age = 45;
		e1.salary = 200000;

		Employee e2 = new Employee();
		e2.name = "Jeff";
		e2.age = 55;
		e2.salary = 150000;

		System.out.println(e2.compareTo(e1));
		
		if (e1.compareTo(e2) < 0) {
			System.out.println(e2.name + " salary is max");
		} else {
			System.out.println(e1.name + " salary is max");
		}
	}

	@Override
	public int compareTo(Employee o) {
		return this.salary - o.salary;
	}
}
