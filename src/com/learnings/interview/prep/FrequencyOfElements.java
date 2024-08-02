package com.learnings.interview.prep;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElements {
	public static void main(String[] args) {
		
		/* Frequency of characters in a string: */

		String str = "pradeep adireddi";
		Map<Character, Long> charCount = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Frequency of characters: \n"+charCount);
	}
}
