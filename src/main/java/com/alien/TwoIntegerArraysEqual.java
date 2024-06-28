package com.alien;

import java.util.Arrays;

public class TwoIntegerArraysEqual {

	public static void main(String[] args) {

		int[] integers1 = new int[] { 3, 4, 5, 6, 1, 5 };
		int[] integers2 = new int[] { 3, 4, 5, 6, 1, 5 };
		int[] integers3 = new int[] { 3, 4, 5, 6, 1, 3 };

		System.out.println("equals:\n------\n");

		boolean i12 = Arrays.equals(integers1, integers2);
		System.out.println("integers 1 equal integers 2? " + i12);

		boolean i13 = Arrays.equals(integers1, integers3);
		System.out.println("integers 1 equal integers 3? " + i13);

	}

}
