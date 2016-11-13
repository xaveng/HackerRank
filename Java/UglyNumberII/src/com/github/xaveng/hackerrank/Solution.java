package com.github.xaveng.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xaveng on 11/13/2016.
 */
public class Solution {
    // https://discuss.leetcode.com/topic/22982/java-easy-understand-o-n-solution
    public int nthUglyNumber(int n) {
        if (n <= 0) {
            return 0;
        }
        int a = 0, b = 0, c = 0;
        List<Integer> results = new ArrayList<>();
        results.add(1);
        while (results.size() < n) {
            int nextValue = Math.min(results.get(a) * 2, Math.min(results.get(b) * 3, results.get(c) * 5));
            results.add(nextValue);
            if (results.get(a) * 2 == nextValue) a++;
            if (results.get(b) * 3 == nextValue) b++;
            if (results.get(c) * 5 == nextValue) c++;
        }
        return results.get(results.size() - 1);
    }
}