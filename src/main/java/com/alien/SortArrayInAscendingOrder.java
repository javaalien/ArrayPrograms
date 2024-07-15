package com.alien;

import java.util.Arrays;

// Java Program to Sort an Array in Ascending Order

public class SortArrayInAscendingOrder {

	public static void main(String[] args) {

		int[] numbers = { 5, 1, 4, 2, 3 };
		System.out.println("Original array:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}

		Arrays.sort(numbers);

		System.out.println("\nSorted array in ascending order:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
}
