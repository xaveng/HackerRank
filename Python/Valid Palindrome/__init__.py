import re

class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        regex = re.compile('[^a-zA-Z0-9]')
        s = regex.sub('', s)
        length = len(s)
        s = s.lower()
        for i in range(int(length / 2)):
            if s[i] != s[length - i - 1]:
                return False

        return True


solution = Solution()
assert solution.isPalindrome('A man, a plan, a canal: Panama')
assert not solution.isPalindrome('race a car')
