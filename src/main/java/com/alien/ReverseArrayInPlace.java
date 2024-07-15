package com.alien;

// Java Program to Reverse an Array Without Using Another Array

public class ReverseArrayInPlace {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		System.out.println("Original Array: ");
		printArray(array);

		reverseArray(array);

		System.out.println("Reversed Array: ");
		printArray(array);

	}

	private static void reverseArray(int[] array) {
		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;

			left++;
			right--;
		}
	}

	private static void printArray(int[] array) {

		for (int element : array) {
			System.out.print(element + " ");
		}

		System.out.println();
	}
}
