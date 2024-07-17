package com.alien;

// Java Program to Add Two Matrices

public class MatrixAddition {

	public static void main(String[] args) {

		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] matrix2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int rows = matrix1.length;
		int columns = matrix1[0].length;

		if (rows != matrix2.length || columns != matrix2[0].length) {
			System.out.println("Matrices of different dimensions cannot be added!");
			return;
		}

		int[][] sumMatrix = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		System.out.println("Matrix 1:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Matrix 2:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Sum of Matrices:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(sumMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
