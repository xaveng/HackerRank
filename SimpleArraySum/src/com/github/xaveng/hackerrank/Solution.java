package com.github.xaveng.hackerrank;

import java.util.Scanner;

/**
 * You are given an array of integers of size N. Can you find the sum of the
 * elements in the array?
 * 
 * Input The first line of input consists of an integer N. The next line
 * contains N space-separated integers representing the array elements. Sample:
 * 
 * <pre>
 * 6
 * 1 2 3 4 10 11
 * </pre>
 * 
 * Output Output a single value equal to the sum of the elements in the array.
 * For the sample above you would just print 31 since 1+2+3+4+10+11=31.
 */
public class Solution {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		try (Scanner scanner = new Scanner(System.in)) {
			int count = scanner.nextInt();
			int sum = 0;
			for (int i = 0; i < count; ++i) {
				sum += scanner.nextInt();
			}
			System.out.println(sum);
		}
	}
}
