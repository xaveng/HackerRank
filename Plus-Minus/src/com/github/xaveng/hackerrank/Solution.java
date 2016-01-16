package com.github.xaveng.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Given an array of integers, calculate which fraction of the elements are
 * positive, negative, and zeroes, respectively. Print the decimal value of each
 * fraction.
 * 
 * Input Format
 * 
 * The first line, N, is the size of the array. The second line contains N
 * space-separated integers describing the array of numbers (A1,A2,A3,⋯,AN).
 * 
 * Output Format
 * 
 * Print each value on its own line with the fraction of positive numbers first,
 * negative numbers second, and zeroes third.
 * 
 * Sample Input
 * 
 * <pre>
 * 6
 * -4 3 -9 0 4 1
 * </pre>
 * 
 * Sample Output
 * 
 * <pre>
 * 0.500000
 * 0.333333
 * 0.166667
 * </pre>
 * 
 * Explanation
 * 
 * There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.
 * The fraction of the positive numbers, negative numbers and zeroes are
 * 36=0.500000, 26=0.333333 and 16=0.166667, respectively.
 * 
 * Note: This challenge introduces precision problems. The test cases are scaled
 * to six decimal places, though answers with absolute error of up to 10−4 are
 * acceptable.
 */
public class Solution {

	static class Counter {
		int value = 0;

		public Counter(int val) {
			value = val;
		}

		public void increment() {
			++value;
		}

		public int get() {
			return value;
		}
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		double count = scanner.nextInt();
		Map<Predicate<Integer>, Counter> predicateMap = new HashMap<>();
		predicateMap.put(i -> i > 0, new Counter(0));
		predicateMap.put(i -> i == 0, new Counter(0));
		predicateMap.put(i -> i < 0, new Counter(0));

		while (scanner.hasNext()) {
			int value = scanner.nextInt();
			predicateMap.keySet().stream().forEach(pred -> {
				if (pred.test(value)) {
					predicateMap.get(pred).increment();
				}
			});
		}
		scanner.close();
		predicateMap.keySet().stream().forEach(key -> {
			System.out.println(divide(predicateMap.get(key).get(), count));
		});
	}

	private static String divide(double divident, double divisor) {
		return String.format("%.6f", divident / divisor);
	}
}
