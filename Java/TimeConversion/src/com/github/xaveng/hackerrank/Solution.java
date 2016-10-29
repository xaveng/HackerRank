package com.github.xaveng.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Given a time in AM/PM format, convert it to military (24-hour) time.
 * 
 * Note: Midnight is 12:00:00AM on a 12-hour clock and 00:00:00 on a 24-hour
 * clock. Noon is 12:00:00PM on a 12-hour clock and 12:00:00 on a 24-hour clock.
 * 
 * Input Format
 * 
 * <pre>
 * A time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01≤hh≤12.
 * </pre>
 * 
 * Output Format
 * 
 * <pre>
 * Convert and print the given time in 24-hour format, where 00≤hh≤23.
 * </pre>
 * 
 * Sample Input
 * 
 * <pre>
 * 07:05:45PM
 * </pre>
 * 
 * Sample Output
 * 
 * <pre>
 * 19:05:45
 * </pre>
 * 
 * Explanation
 * 
 * 7 PM is after noon, so you need to add 12 hours to it during conversion. 12 +
 * 7 = 19. Minutes and seconds do not change in 12-24 hour time conversions, so
 * the answer is 19:05:45.
 */
public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
		SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa", Locale.US);
		Date date;
		try (Scanner scanner = new Scanner(System.in)) {
			date = parseFormat.parse(scanner.nextLine().trim());
			System.out.println(displayFormat.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}