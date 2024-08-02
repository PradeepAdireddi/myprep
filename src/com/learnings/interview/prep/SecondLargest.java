package com.learnings.interview.prep;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargest {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(5, 18, 29, 27, 6);
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : numbers) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num < largest) {
				secondLargest = num;
			}
		}
		System.out.println("second Largest number is: " + secondLargest);

		Optional<Integer> second = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		if (second.isPresent()) {
			System.out.println(second);
		} else {
			System.out.println("no second largest elemnt is found");
		}

		List<Integer> number = List.of();
		Optional<Integer> secondL = number.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		if (secondL.isPresent()) {
			System.out.println(secondL);
		} else {
			System.out.println("no second largest elemnt is found");
		}
	}
}
