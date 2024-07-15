package com.alien;

import java.util.Arrays;

public class DeepEqualsExample {

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] matrix3 = { { 7, 8, 9 }, { 10, 11, 12 } };

		boolean deepEquals = Arrays.deepEquals(matrix1, matrix2);
		System.out.println("Matrix1 equals Matrix2: " + deepEquals);

		deepEquals = Arrays.deepEquals(matrix1, matrix3);

		System.out.println("Matrix1 equals Matrix3: " + deepEquals);

	}
}
