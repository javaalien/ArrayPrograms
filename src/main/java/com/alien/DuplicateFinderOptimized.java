package com.alien;

import java.util.HashSet;
import java.util.Set;

// Java Program to Find Duplicate Elements in an Array Optimized

public class DuplicateFinderOptimized {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 2, 4, 5, 3 };

		System.out.println("Duplicate elements in the array are:");
		findDuplicates(arr);

	}

	private static void findDuplicates(int[] arr) {
		Set<Integer> set = new HashSet<>();

		for (Integer value : arr) {
			if (!set.add(value)) {
				System.out.println(value);
			}
		}
	}
}
