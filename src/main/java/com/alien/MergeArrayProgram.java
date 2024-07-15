package com.alien;

import java.util.Arrays;

public class MergeArrayProgram {

	public static void main(String[] args) {

		int[] arrayA = new int[] { 1, 2, 3, 4, 5 };

		int[] arrayB = new int[] { 6, 7, 8, 9, 10 };

		int[] mergedArray = mergeArray(arrayA, arrayB);

		System.out.println("Array A : " + Arrays.toString(arrayA));
		System.out.println("Array B : " + Arrays.toString(arrayB));
		System.out.println("Merged Array : " + Arrays.toString(mergedArray));

	}

	private static int[] mergeArray(int[] arrayA, int[] arrayB) {

		int[] mergedArray = new int[arrayA.length + arrayB.length];

		int i = 0, j = 0, k = 0;

		while (i < arrayA.length && j < arrayB.length) {
			if (arrayA[i] < arrayB[j]) {
				mergedArray[k] = arrayA[i];
				i++;
				k++;
			} else {
				mergedArray[k] = arrayB[j];
				j++;
				k++;
			}
		}

		while (i < arrayA.length) {
			mergedArray[k] = arrayA[i];
			i++;
			k++;
		}

		while (j < arrayB.length) {
			mergedArray[k] = arrayB[j];
			j++;
			k++;
		}

		return mergedArray;
	}
}
