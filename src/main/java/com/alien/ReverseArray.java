package com.alien;

// How do you reverse an array?

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 7, 6, 4, 9, 12 };

		for (int i = 0; i < arr.length / 2; i++) {

			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;

		}

		System.out.println("Reversed Array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
