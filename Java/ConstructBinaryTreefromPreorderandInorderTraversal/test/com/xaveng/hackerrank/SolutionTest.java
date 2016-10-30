package com.xaveng.hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void buildTree() throws Exception {
        Solution solution = new Solution();
        Assert.assertEquals("1[2[,],3[,]]", solution.buildTree(new int[]{1, 2, 3}, new int[]{2, 1, 3}).toString());
        Assert.assertEquals("1[2[,],]", solution.buildTree(new int[]{1, 2}, new int[]{2, 1}).toString());
        Assert.assertEquals("1[,3[2[,],4[,]]]", solution.buildTree(new int[]{1, 3, 2, 4}, new int[]{1, 2, 3, 4}).toString());
    }

    @Test
    public void testTreeNode() {
        TreeNode treeNode = new TreeNode(1);
        Assert.assertEquals("1[,]", treeNode.toString());
        treeNode.left = new TreeNode(2);
        Assert.assertEquals("1[2[,],]", treeNode.toString());
        treeNode.right = new TreeNode(3);
        Assert.assertEquals("1[2[,],3[,]]", treeNode.toString());
    }
}