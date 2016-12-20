# https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
# Definition for a binary tree node.


class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

    def __str__(self):
        if not self.val:
            return 'None'
        return '{}[{}, {}]'.format(self.val, self.left, self.right)


class Solution(object):
    def zigzagLevelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        current = [root]
        next = []

        result = []
        reverse = False
        while current:
            temp = [node.val for node in current if node and node.val is not None]
            if reverse:
                temp.reverse()

            if temp:
                result.append(temp)
            reverse = not reverse

            for node in current:
                if node:
                    next.append(node.left)
                    next.append(node.right)
            current = next
            next = []

        return result


def createTree(str):
    current = []
    next = []
    root = None
    for node in str:
        if not current:
            current = next
            next = []

        if not current:
            root = TreeNode(node)
            current.append(root)
        else:
            if not current[0].left:
                current[0].left = TreeNode(node)
                next.append(current[0].left)
            else:
                current[0].right = TreeNode(node)
                next.append(current[0].right)
                current.pop(0)

        pass
    return root


if __name__ == '__main__':
    root = TreeNode(3)

    root.left = TreeNode(9)
    root.right = TreeNode(20)

    root.left.left = None
    root.left.right = None
    root.right.left = TreeNode(15)
    root.right.right = TreeNode(7)

    assert str(createTree([3, 9, 20, None, None, 15, 7])) == str(root)

    solution = Solution()
    assert solution.zigzagLevelOrder(createTree([3, 9, 20, None, None, 15, 7])) == [[3], [20, 9], [15, 7]]
    assert solution.zigzagLevelOrder(createTree([0, 2, 4, 1, None, 3, -1, 5, 1, None, 6, None, 8])) == [[0], [4, 2],
                                                                                                        [1, 3, -1],
                                                                                                        [8, 6, 1, 5]]
    pass
