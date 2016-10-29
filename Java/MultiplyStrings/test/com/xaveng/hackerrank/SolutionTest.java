package com.xaveng.hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void multiplyTest() {
        Solution solution = new Solution();
        Assert.assertEquals("24", solution.multiply("12", "2"));
        Assert.assertEquals("36", solution.multiply("12", "3"));
        Assert.assertEquals("60", solution.multiply("12", "5"));
        Assert.assertEquals("24", solution.multiply("2", "12"));
        Assert.assertEquals("144", solution.multiply("12", "12"));
        Assert.assertEquals("56088", solution.multiply("123", "456"));
    }

}