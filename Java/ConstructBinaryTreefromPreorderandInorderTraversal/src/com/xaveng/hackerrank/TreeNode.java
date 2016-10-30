package com.xaveng.hackerrank;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(val);
        sb.append("[");
        if (left != null) {
            sb.append(left.toString());
        }
        sb.append(",");
        if (right != null) {
            sb.append(right.toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
