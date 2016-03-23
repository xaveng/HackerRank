'''
Created on 2016. 2. 14.

@author: SeoJeong
'''
'''
https://leetcode.com/problems/count-of-smaller-numbers-after-self/

315. Count of Smaller Numbers After Self

You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].

Example:

Given nums = [5, 2, 6, 1]

To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.
Return the array [2, 1, 1, 0].
'''
# https://leetcode.com/discuss/77659/clear-python-code-using-binary-indexed-tree
class Solution(object):
    def lowbit(self, i):
        return i & (-i)

    def add(self, c, n, i, val):
        while i <= n:
            c[i] += val
            i += self.lowbit(i)

    def getSum(self, c, i):
        res = 0
        while i > 0:
            res += c[i]
            i -= self.lowbit(i)
        return res

    def countSmaller(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        find_i = {}
        cnt = 1
        for n in sorted(nums):
            if n not in find_i:
                find_i[n] = cnt
                cnt += 1

        res = []
        c = [0 for i in range(cnt + 1)]
        for i in range(len(nums) - 1, -1, -1):
            res += self.getSum(c, find_i[nums[i]] - 1),
            self.add(c, cnt, find_i[nums[i]], 1)
        return res[::-1]
    
class MySolution(object):
    def countSmaller(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        result = [0] * n
        for i in range(n - 1, -1, -1):
            for j in range(i + 1, n):
                if nums[i] > nums[j]:
                    result[i] = result[j] + 1
                    break
                pass
            pass
        return result
        pass
            
if __name__ == '__main__':
    print(Solution().countSmaller([5, 2, 6, 1]))
    pass
