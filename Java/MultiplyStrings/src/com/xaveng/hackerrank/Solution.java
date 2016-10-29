package com.xaveng.hackerrank;

public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();

        int[] subResult = new int[len1 + len2];

        for(int i = len1 - 1; i >= 0; --i) {
            for(int j = len2 - 1; j >= 0; --j) {
                int pos1 = i + j;
                int pos2 = pos1 + 1;

                int sum = Character.getNumericValue(num1.charAt(i))
                        * Character.getNumericValue(num2.charAt(j))
                        + subResult[pos2];

                subResult[pos1] += sum / 10;
                subResult[pos2] = sum % 10;
            }
        }

        StringBuilder result = new StringBuilder();
        for(int val : subResult) {
            if(!(result.length() == 0 && val == 0)) {
                result.append(val);
            }
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}
