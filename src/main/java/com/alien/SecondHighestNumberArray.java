package com.alien;

// Write a Java Program to find the second-highest number in an array.

public class SecondHighestNumberArray {

	public static void main(String[] args) {

		int arr[] = { 34, 65, 77, 90, 23, 54, 74, 29, 47 };

		int secondhighestNum = secondHighest(arr);

		System.out.println(secondhighestNum);

	}

	private static int secondHighest(int[] arr) {
		int highest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > highest) {
				secondHighest = highest;
				highest = num;
			} else if (num > secondHighest && num != highest) {
				secondHighest = num;
			}
		}
		return secondHighest;
	}
}
