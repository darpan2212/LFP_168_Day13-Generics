package com.bridglelabz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxTester {

	@Test
	public void findIntMax() {
		FindMaximum<Integer> findMaxInt = new FindMaximum<>();
		int actualOp = findMaxInt.findMax(4, 9, 3);
		assertEquals(9, actualOp);
	}

	@Test
	public void findFloatMax() {
		FindMaximum<Float> findMaxFloat = new FindMaximum<>();
		float actualOp = findMaxFloat.findMax(15f, 9.7f, 10.4f);
		assertEquals(15f, actualOp, 10);
	}

	@Test
	public void findStringMax() {
		FindMaximum<String> findMaxString = new FindMaximum<>();
		String actualOp = findMaxString.findMax("zello", "how", "z");
		System.out.println(actualOp);
		assertEquals("zello", actualOp);
	}

	@Test
	public void findEmpMax() {
		FindMaximum<Employee> findMaxString = new FindMaximum<>();
		Employee e1 = new Employee();
		e1.name = "Elon";
		e1.age = 45;
		e1.salary = 200000;

		Employee e2 = new Employee();
		e2.name = "JEFF";
		e2.age = 55;
		e2.salary = 150000;

		Employee e3 = new Employee();
		e3.name = "Bill";
		e3.age = 61;
		e3.salary = 250000;

		Employee actualOp = findMaxString.findMax(e1, e2, e3);
		System.out.println(actualOp.name);
		assertEquals(e3, actualOp);
	}

}