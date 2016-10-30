package com.xaveng.hackerrank;

public class Solution {
    public int findInList(int[] list, int left, int right, int value) {
        for (int i = left; i < right; ++i) {
            if (list[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode helper(int[] preOrder, int preIndex, int[] inorder, int inLeft, int inRight) {
        if (preIndex >= preOrder.length || inLeft > inRight) {
            return null;
        }

        int currentValue = preOrder[preIndex];
        TreeNode root = new TreeNode(currentValue);

        int inIndex = findInList(inorder, inLeft, inRight, currentValue);
        if (inIndex == -1) {
            return null;
        }

        root.left = helper(preOrder, preIndex + 1, inorder, inLeft, inIndex);
        root.right = helper(preOrder, preIndex + (inIndex - inLeft) + 1, inorder, inIndex + 1, inRight);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        return helper(preorder, 0, inorder, 0, inorder.length);
    }
}
