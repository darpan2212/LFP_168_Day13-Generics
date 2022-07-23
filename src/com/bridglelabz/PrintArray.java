package com.bridglelabz;

public class PrintArray {

	public static <T> void printArr(T[] arr) {
		for (T t : arr) {
			System.out.print(t + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer[] intArr = new Integer[] { 1, 4, 8, 12, 56, 34, 78, 43 };
		printArr(intArr);

		Double[] doubleArr = new Double[] { 1.2, 4.4, 8.6, 12.1, 56.76, 34.21, 78.9,
				43.21 };
		printArr(doubleArr);

		String[] strArr = new String[] { "hello", "world", "how", "are", "you", "?" };
		printArr(strArr);
	}
}