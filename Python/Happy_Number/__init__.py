# https://leetcode.com/problems/happy-number/
from functools import reduce


class Solution(object):
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        results = []
        val = 0
        while val != 1:
            val = reduce(lambda x, y: x + y, map(lambda c: int(c) * int(c), list(str(n))))
            if val in results:
                return False
            results.append(val)
            n = val
            pass
        return val == 1


if __name__ == '__main__':
    solution = Solution()
    assert solution.isHappy(19) is True
    assert solution.isHappy(2) is False
