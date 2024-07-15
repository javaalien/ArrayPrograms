package com.alien;

// Java Program to Calculate the Average of Array Elements

public class CalculateAverageOfArray {

	public static void main(String[] args) {

		int[] numbers = { 5, 7, 8, 2, 4 };

		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}

		double average = (double) sum / numbers.length;

		System.out.println("Average of array elements: " + average);

	}
}
