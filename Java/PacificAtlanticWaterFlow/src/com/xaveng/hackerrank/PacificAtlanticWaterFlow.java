package com.xaveng.hackerrank;

import java.util.ArrayList;
import java.util.List;

// https://discuss.leetcode.com/topic/62379/java-bfs-dfs-from-ocean
public class PacificAtlanticWaterFlow {
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public void dfs(int[][] matrix, boolean[][] visited, int height, int i, int j) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length
                || visited[i][j] || matrix[i][j] < height) {
            return;
        }
        visited[i][j] = true;
        for (int[] direction : directions) {
            dfs(matrix, visited, matrix[i][j], i + direction[0], j + direction[1]);
        }
    }

    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int x = matrix.length;
        int y = matrix[0].length;

        boolean[][] pacific = new boolean[x][y];
        boolean[][] atlantic = new boolean[x][y];

        for (int i = 0; i < x; ++i) {
            dfs(matrix, pacific, 0, i, 0);
            dfs(matrix, atlantic, 0, i, y - 1);
        }

        for (int i = 0; i < y; ++i) {
            dfs(matrix, pacific, 0, 0, i);
            dfs(matrix, atlantic, 0, x - 1, i);
        }

        for (int i = 0; i < x; ++i) {
            for (int j = 0; j < y; ++j) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(new int[]{i, j});
                }
            }
        }

        return result;
    }
}
