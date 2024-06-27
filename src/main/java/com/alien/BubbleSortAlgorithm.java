package com.alien;

// How would you implement the bubble sort algorithm?

public class BubbleSortAlgorithm {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 7, 6, 4, 9, 12 };
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("Bubble Sort :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}