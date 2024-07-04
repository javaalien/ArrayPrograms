package com.alien;

import java.util.HashMap;
import java.util.Map;

// Given an array of integers nums and an integer target, 
// return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, 
// and you may not use the same element twice. You can return the answer in any order.

public class TwoSumExample {

	public static void main(String[] args) {

		int arr[] = { 2, 7, 11, 15 };

		int target = 9;

		int res[] = twoSum(arr, target);

		for (int i : res) {
			System.out.println(i);
		}

	}

	private static int[] twoSum(int[] arr, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(arr[i], i);
		}
		throw new IllegalArgumentException("No Two sum Solution");
	}

}
