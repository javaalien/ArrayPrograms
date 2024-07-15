package com.alien;

//  What is an Anonymous Array in Java? Give an Example?

public class AnonymousArray {

	public static void main(String[] args) {
		sum(new int[] { 1, 2, 3 });
	}

	private static void sum(int[] arr) {
		int total = 0;

		// using for-each loop
		for (int i : arr)
			total = total + i;

		System.out.println("The sum is:" + total);
	}
}
