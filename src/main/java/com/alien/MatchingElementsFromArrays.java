package com.alien;

// How do you get the matching elements in an integer array?

public class MatchingElementsFromArrays {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 6, 7, 5 };

		for (int m = 0; m < arr.length; m++) {
			for (int n = m + 1; n < arr.length; n++) {
				if (arr[m] == arr[n])
					System.out.println(arr[m]);
			}
		}
	}

}
