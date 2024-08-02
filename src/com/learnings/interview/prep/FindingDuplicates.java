package com.learnings.interview.prep;

import java.util.Arrays;

public class FindingDuplicates {
	public static void main(String[] args) {
		int num[] = { 1, 3, 2, 4, 3, 2 };
		
		System.out.print("Duplicate elements: ");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.print(num[i] + " ");
				}
			}
		}

		System.out.print("\nStream result for Removing duplicates: ");
		int numb[] = Arrays.stream(num).distinct().toArray();
		System.out.println(Arrays.toString(numb));
	}
}