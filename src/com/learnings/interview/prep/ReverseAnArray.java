package com.learnings.interview.prep;

import java.util.Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		
		/*for int array*/
		int[] num = new int[] { 15, 5, 87, 21, 2 };
		System.out.println("Original Array"+ (Arrays.toString(num)));
		System.out.print("Reversed int: ");
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
		/*for Char array*/
		char[] data = new char[] { 'a','v','s','g','p','k' };
		System.out.println("\nOriginal Array"+ (Arrays.toString(data)));
		System.out.println("Reversed char array: ");
		for (int i = data.length - 1; i >= 0; i--) {
			System.out.print(data[i] + " ");
		}
		/*from String*/
		String str = "021365";
		String rev1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev1 = rev1 + str.charAt(i);
		}
		System.out.println("\nReverse String using for loop:" + rev1);

		String rev2 = new StringBuffer(str).reverse().toString();
		System.out.println("Using string builder: " + rev2);

	}
}