package com.alien;

import java.util.Arrays;
import java.util.Collections;

// Java Program to Sort an Array in Descending Order

public class SortArrayInDescendingOrder {

	public static void main(String[] args) {

		Integer[] numbers = { 5, 1, 4, 2, 3 }; // Use Integer for compatibility with Collections.reverse()
		System.out.println("Original array:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}

		Arrays.sort(numbers, Collections.reverseOrder());

		System.out.println("\nSorted array in descending order:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
}
