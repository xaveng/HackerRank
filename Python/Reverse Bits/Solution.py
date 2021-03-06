'''
Created on 2016. 2. 14.

@author: SeoJeong
'''
'''
    https://leetcode.com/problems/reverse-bits/
    
    190. Reverse Bits

Reverse bits of a given 32 bits unsigned integer.
For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?

Related problem: Reverse Integer

'''
class Solution(object):
    def reverseBits(self, n):
        """
        :type n: int
        :rtype: int
        """
        return int(bin(n)[2:].zfill(32)[::-1], 2)
    pass

        
if __name__ == '__main__':
    print(Solution().reverseBits(1))
    pass