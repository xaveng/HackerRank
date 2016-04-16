package com.github.xaveng.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Welcome to Day 3! Check out a review of if-else statements here, or just jump
 * right into the problem.
 * 
 * Using "if-else" you can perform decision making in your code. See the
 * flowchart below (taken from wikipedia):
 * 
 * 332px-If-Then-Else-diagram.svg.png
 * 
 * This problem will test your knowledge on "if-else" statements.
 * 
 * Given an integer N as input, check the following:
 * 
 * <pre>
 * * If N is odd, print "Weird".
 * * If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
 * * If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
 * * If N is even and N>20, print "Not Weird".
 * </pre>
 * 
 * We have given you partially completed code in the editor, complete it to
 * solve the problem.
 * 
 * Input Format
 * 
 * There is a single line of input: integer N.
 * 
 * Constraints
 * 
 * <pre>
 * 1≤N≤100
 * </pre>
 * 
 * Output Format
 * 
 * Print "Weird" if the number is weird. Otherwise, print "Not Weird". Do not
 * print the quotation marks.
 * 
 * Sample Input 1
 * 
 * <pre>
 * 3
 * </pre>
 * 
 * Sample Output 1
 * 
 * <pre>
 * Weird
 * </pre>
 * 
 * Explanation N=3, is odd hence the its a Weird Number.
 * 
 * Sample Input 2
 * 
 * <pre>
 * 24
 * </pre>
 * 
 * Sample Output 2
 * 
 * <pre>
 * Not Weird
 * </pre>
 * 
 * Explanation N=24, is >20 hence its not a Weird Number.
 */
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1)
			// If N is odd, print "Weird".
			ans = "Weird";
		else {
			// If N is even
			if (2 <= n && n <= 5) {
				// between the range of 2 and 5(inclusive),print "Not Weird".
				ans = "Not Weird";
			} else if (6 <= n && n <= 20) {
				// If N is even and, in between the range of 6 and
				// 20(inclusive), print "Weird".
				ans = "Weird";
			} else if (n >= 20) {
				// If N is even and N>20, print "Not Weird".
				ans = "Not Weird";
			}
		}
		System.out.println(ans);
	}
}
