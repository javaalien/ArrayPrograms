package com.alien;

// How would you implement the insertion sort algorithm?

public class InsertionSortAlgorithm {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 7, 6, 4, 9, 12 };

		for (int m = 1; m < arr.length; m++) {
			int n = m;
			while (n > 0 && arr[n - 1] > arr[n]) {

				int k = arr[n];
				arr[n] = arr[n - 1];
				arr[n - 1] = k;
				n--;

			}
		}

		System.out.println("Insertion Sort : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
