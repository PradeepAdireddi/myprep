package com.learnings.interview.prep;

public class AscendingAndDescendingOrder {
	public static void main(String[] args) {
		int num[] = new int[] { 15, 58, 87, 21, 2 };
		int temp = 0;
		
		System.out.println("original array:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		System.out.println("\nAscending Sort:");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		System.out.println("\nDescending Sort:");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
