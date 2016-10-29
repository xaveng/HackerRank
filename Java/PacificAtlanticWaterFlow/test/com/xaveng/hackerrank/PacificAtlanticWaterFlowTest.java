package com.xaveng.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PacificAtlanticWaterFlowTest {
    public static String toString(List<int[]> value) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        value.forEach(pair -> {
            sb.append(String.format("[%d,%d]", pair[0], pair[1]));
            sb.append(",");
        });
        sb.setLength(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }


    @Test
    public void pacificAtlantic() throws Exception {
        PacificAtlanticWaterFlow pacificAtlanticWaterFlow = new PacificAtlanticWaterFlow();
        Assert.assertEquals("[[0,2],[1,1],[2,0]]",
                toString(pacificAtlanticWaterFlow.pacificAtlantic(
                        new int[][]{{1, 1, 2}, {1, 2, 1}, {2, 1, 1}})));
        Assert.assertEquals("[[0,2],[1,0],[1,1],[1,2],[2,0],[2,1],[2,2]]",
                toString(pacificAtlanticWaterFlow.pacificAtlantic(
                        new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}})));
    }

}