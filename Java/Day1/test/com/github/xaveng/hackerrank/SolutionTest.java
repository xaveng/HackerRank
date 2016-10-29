package com.github.xaveng.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

	private List<String> testCases = new ArrayList<>();

	{
		testCases.add("5.35");
		testCases.add("'a'");
		testCases.add("false");
		testCases.add("100");
		testCases.add("\"I am a code monkey\"");
		testCases.add("true");
		testCases.add("17.3");
		testCases.add("'c'");
		testCases.add("\"derp\"");
	}

	@Test
	public void test() {
		StringBuffer actualBuffer = new StringBuffer();
		testCases.forEach(testCase -> {
			try (ByteArrayOutputStream out = new ByteArrayOutputStream(); PrintStream stream = new PrintStream(out)) {
				System.setOut(stream);
				Solution.test(testCase);
				actualBuffer.append("TestCase: [");
				actualBuffer.append(testCase);
				actualBuffer.append("], Result: [");
				actualBuffer.append(out.toString().replace("\n", "").replace("\r", ""));
				actualBuffer.append("]\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		StringBuffer expectedBuffer = new StringBuffer();
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(this.getClass().getResourceAsStream("expected.txt")))) {
			String expected;
			while ((expected = br.readLine()) != null) {
				expectedBuffer.append(expected + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(expectedBuffer.toString(), actualBuffer.toString());
	}

}
