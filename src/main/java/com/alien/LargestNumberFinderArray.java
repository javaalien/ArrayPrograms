package com.alien;

public class LargestNumberFinderArray {

	public static void main(String[] args) {

		int[] arr = { 25, 47, 33, 56, 19, 40 };
		int largest = findLargest(arr);
		System.out.println("The largest number in the array is: " + largest);

	}

	private static int findLargest(int[] arr) {

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}
}
