package com.learnings.interview.prep;

public class LargestAndSmallestElement {
	public static void main(String[] args) {
		int[] num = new int[] { 15, 58, 87, 21, 2 };
		/*
		 * Largest element in an array
		 */
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(max);

		/*
		 * Smallest element in an array
		 */
		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println(min);
	}
}
