package com.alien;

import java.util.Arrays;

// Java Program to Check Two Arrays are Equal

public class ArraysEqualsExample {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 1, 2, 3, 4, 5 };
		int[] array3 = { 5, 4, 3, 2, 1 };

		boolean isEqual = Arrays.equals(array1, array2);
		System.out.println("Array1 equals Array2: " + isEqual);

		isEqual = Arrays.equals(array1, array3);
		System.out.println("Array1 equals Array3: " + isEqual);

	}
}
