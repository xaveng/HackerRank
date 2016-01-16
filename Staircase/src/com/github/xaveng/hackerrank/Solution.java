package com.github.xaveng.hackerrank;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Your teacher has given you the task of drawing a staircase structure. Being
 * an expert programmer, you decided to make a program to draw it for you
 * instead. Given the required height, can you print a staircase as shown in the
 * example?
 * 
 * Input You are given an integer N depicting the height of the staircase.
 * 
 * Output Print a staircase of height N that consists of # symbols and spaces.
 * For example for N=6, here's a staircase of that height:
 * 
 * <pre>
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 * ######
 * </pre>
 * 
 * Note: The last line has 0 spaces before it.
 */
public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		try (Scanner scanner = new Scanner(System.in)) {
			int line = scanner.nextInt();
			IntStream.range(1, line + 1).forEach(i -> {
				printSharp(line - i, i);
			});
		}
	}

	public static String createString(int count, String value) {
		return String.join("", Collections.nCopies(count, value));
	}

	public static void printSharp(int blank, int sharp) {
		System.out.println(String.join("", new String[] { createString(blank, " "), createString(sharp, "#") }));
	}
}