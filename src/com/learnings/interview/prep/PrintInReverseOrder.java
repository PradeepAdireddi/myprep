package com.learnings.interview.prep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrintInReverseOrder {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 20, 33, 13, 05);
		System.out.println("Reverse Order:");
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("Natural Order:");
		numbers.stream().sorted().forEach(System.out::println);

	}

}
