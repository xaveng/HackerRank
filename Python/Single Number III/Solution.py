'''
Created on 2016. 2. 14.

@author: SeoJeong
'''
'''
https://leetcode.com/problems/single-number-iii/

260. Single Number III

Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?

'''

class Solution(object):
    '''
    classdocs
    '''


    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        counts = {}
        for n in nums:
            if n in counts:
                counts[n] = counts[n] + 1;
                pass
            else:
                counts[n] = 1
                pass
            pass
        singleNumbers = []
        for key in counts:
            if counts[key] == 1:
                singleNumbers.append(key)
                pass
            pass
        return singleNumbers
    pass

        
if __name__ == '__main__':
    print(Solution().singleNumber([-1, 0]))
    pass
