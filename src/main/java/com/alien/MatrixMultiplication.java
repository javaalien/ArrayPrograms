package com.alien;

// Java Program to Multiply Matrix Using Multi-dimensional Arrays

public class MatrixMultiplication {

	public static void main(String[] args) {

		int[][] firstMatrix = { { 1, 2 }, { 3, 4 } };
		int[][] secondMatrix = { { 5, 6 }, { 7, 8 } };

		if (firstMatrix[0].length != secondMatrix.length) {
			System.out.println("Matrix multiplication is not possible");
			return;
		}

		int[][] resultMatrix = new int[firstMatrix.length][secondMatrix[0].length];

		for (int i = 0; i < firstMatrix.length; i++) {
			for (int j = 0; j < secondMatrix[0].length; j++) {
				for (int k = 0; k < firstMatrix[0].length; k++) {
					resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}

		System.out.println("Result of matrix multiplication:");
		for (int[] row : resultMatrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}
