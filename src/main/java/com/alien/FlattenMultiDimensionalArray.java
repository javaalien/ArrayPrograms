package com.alien;

import java.util.Arrays;

//  Java Program to Flatten a Multi-dimensional Array

public class FlattenMultiDimensionalArray {

	public static void main(String[] args) {

		int[][] twoDimArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int totalSize = 0;
		for (int[] innerArray : twoDimArray) {
			totalSize += innerArray.length;
		}

		int[] flattenedArray = new int[totalSize];

		int index = 0;
		for (int[] innerArray : twoDimArray) {
			for (int element : innerArray) {
				flattenedArray[index++] = element;
			}
		}

		System.out.println("Flattened array: " + Arrays.toString(flattenedArray));

	}
}
