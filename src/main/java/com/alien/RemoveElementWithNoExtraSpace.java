package com.alien;

// Given an array nums and a value val, remove all instances of that value in-place and 
// return the new length of the array. Do not allocate extra space for another array. 
// You must modify the input array in-place with O(1) extra memory.

public class RemoveElementWithNoExtraSpace {

	public static void main(String[] args) {

		int[] arr = { 34, 67, 88, 9, 12, 54, 76, 9, 23 };

		int val = 9;

		int len = removeElement(arr, val);
		System.out.println(len);

	}

	private static int removeElement(int[] arr, int val) {

		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != val) {
				arr[i] = arr[j];
				i++;
			}
		}
		return i;
	}

}
