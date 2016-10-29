package com.github.xaveng.hackerrank;

import java.util.Scanner;

/**
 * You are given an array of integers of size N. You need to print the sum of
 * the elements in the array, keeping in mind that some of those integers may be
 * quite large.
 * 
 * Input
 * 
 * The first line of the input consists of an integer N. The next line contains
 * N space-separated integers contained in the array.
 * 
 * Constraints
 * 
 * <pre>
 * 1≤N≤10
 * 0≤A[i]≤1010
 * </pre>
 * 
 * Sample Input
 * 
 * <pre>
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 * </pre>
 * 
 * Output Print a single value equal to the sum of the elements in the array. In
 * the above sample, you would print 5000000015.
 * 
 * Note: The range of the 32-bit integer is (−231) to (231−1) or
 * [−2147483648,2147483647]. When we add several integer values, the resulting
 * sum might exceed the above range. You might need to use long long int in
 * C/C++ or long data type in Java to store such sums.
 */
public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		try (Scanner scanner = new Scanner(System.in)) {
			int count = scanner.nextInt();
			long sum = 0;
			for (int i = 0; i < count; ++i) {
				sum += scanner.nextLong();
			}
			System.out.println(sum);
		}
	}

}
