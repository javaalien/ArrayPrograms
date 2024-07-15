package com.alien;

//  Java Program to Split an Array into Two Parts

public class SplitArray {

	public static void main(String[] args) {

		int[] originalArray = { 1, 2, 3, 4, 5, 6 };

		int middleIndex = originalArray.length / 2;

		int[] first = new int[middleIndex];
		int[] second = new int[originalArray.length - middleIndex];

		for (int i = 0; i < first.length; i++) {
			first[i] = originalArray[i];
		}

		for (int i = middleIndex; i < originalArray.length; i++) {
			second[i - middleIndex] = originalArray[i];
		}

		System.out.println("Original array:");
		for (int num : originalArray) {
			System.out.print(num + " ");
		}

		System.out.println("\nFirst half array:");
		for (int num : first) {
			System.out.print(num + " ");
		}

		System.out.println("\nSecond half array:");
		for (int num : second) {
			System.out.print(num + " ");
		}
	}
}
