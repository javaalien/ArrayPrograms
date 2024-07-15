package com.alien;

// Java Program for Array Element Addition and Subtraction

public class ArrayAdditionSubtraction {

	public static void main(String[] args) {

		int[] array1 = { 2, 4, 6, 8 };
		int[] array2 = { 1, 3, 5, 7 };

		int[] additionResult = new int[array1.length];
		int[] subtractionResult = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			additionResult[i] = array1[i] + array2[i];
			subtractionResult[i] = array1[i] - array2[i];
		}

		System.out.println("Addition Result:");

		for (int num : additionResult) {
			System.out.print(num + " ");
		}

		System.out.println("\nSubtraction Result:");
		for (int num : subtractionResult) {
			System.out.print(num + " ");
		}
	}
}
