package com.github.xaveng.hackerrank;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by xaveng on 11/13/2016.
 */
public class SolutionTest {
    @Test
    public void nthUglyNumber() throws Exception {
        Solution solution = new Solution();
        int[] result = new int[] {
                1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18, 20
        };
        for(int i = 0; i < result.length; ++i) {
            Assert.assertEquals(result[i], solution.nthUglyNumber(i + 1));
        }
    }
}