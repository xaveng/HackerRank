package com.github.xaveng.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Welcome to Day 1! Check out the video tutorial here, or just jump right into
 * the problem.
 * 
 * Let's talk about data types. In programming, a data type is a classification
 * of types of data that determine the possible values and operations on that
 * particular type.
 * 
 * Some typical examples of data types are:
 * 
 * <pre>
 * * int 
 * * double 
 * * boolean 
 * * char 
 * * String 
 * * Array
 * </pre>
 * 
 * Remember, in languages like Java data types (like the ones above) can be
 * classified into two main groups:
 * 
 * <pre>
 * 1. Primitive Types 
 * 2. Reference Types
 * </pre>
 * 
 * For this challenge, consider the following inputs (you don't need to read any
 * input):
 * 
 * <pre>
 * * 5.35 
 * * 'a' 
 * * false 
 * * 100 
 * * "I am a code monkey" 
 * * true 
 * * 17.3 
 * * 'c' 
 * * "derp"
 * </pre>
 * 
 * For each line above, print out if it is an instance of a primitive or
 * referenced type as well as which data type it is (using the typical examples
 * above).
 * 
 * Note: This challenge is focused only on Java data types, but you can submit
 * the answer in other languages as well. Hint: In Java, String is a referenced
 * type. Most challenges in upcoming days are language-agnostic.
 * 
 * Good luck!
 * 
 * Output Format
 * 
 * Output nine lines. Print one line for each of the input given above in the
 * following format:
 * 
 * <pre>
 * MainDataTypeOfInstance : SpecificDataTypeOfInstance
 * </pre>
 * 
 * For example, if the input is:
 * 
 * <pre>
 * 123
 * </pre>
 * 
 * Your output should be:
 * 
 * <pre>
 * Primitive : int
 * </pre>
 * 
 * Make sure you spell everything correctly and capitalize your entries. Also,
 * don't forget spaces and colon in between the main and specific data types!
 */

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				test(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static final Map<String, String> regexToTypes = new HashMap<>();

	static {
		regexToTypes.put("^[\\-]?([0-9]*)$", "Primitive : int");
		regexToTypes.put("^[\\-]?([0-9]*)\\.([0-9]+)$", "Primitive : double");
		regexToTypes.put("^(?i)(true|false)$", "Primitive : boolean");
		regexToTypes.put("^\\\'[a-zA-Z0-9]\\\'$", "Primitive : char");
		regexToTypes.put("^\\\"[a-zA-Z0-9 ]*\\\"$", "Referenced : String");
	}

	public static void test(final String line) {
		regexToTypes.keySet().stream().forEach(regex -> {
			if (line.matches(regex)) {
				System.out.println(regexToTypes.get(regex));
			}
		});
	}
}
