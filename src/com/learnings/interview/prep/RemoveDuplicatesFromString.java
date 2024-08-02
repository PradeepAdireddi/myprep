package com.learnings.interview.prep;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String str = "adireddi";

		char str1[] = str.toCharArray();
		System.out.print("Simple for loop Result: ");
		int index = 0;
		boolean isDuplicate = false;
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < i; j++) {
				if (str1[i] == str1[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				str1[index++] = str1[i];
			}
		}
		System.out.println(Arrays.copyOf(str1, index));

		String result = str.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
		System.out.println("Stream Result: " + result);
	}

}
