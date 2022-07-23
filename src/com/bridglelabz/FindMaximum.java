package com.bridglelabz;

public class FindMaximum<E extends Comparable<E>> {

	public E findMax(E a, E b, E c) {
		E max = a;

		if (max.compareTo(b) < 0)
			max = b;

		if (max.compareTo(c) < 0)
			max = c;

		return max;
	}
}