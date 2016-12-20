
import itertools


class Solution(object):
    phoneKey = {
        1: [],
        2: list('abc'),
        3: list('def'),
        4: list('ghi'),
        5: list('jkl'),
        6: list('mno'),
        7: list('pqrs'),
        8: list('tuv'),
        9: list('wxyz'),
        0: [' '],
    }

    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        result = []
        for index in range(len(digits)):
            if len(result) == 0:
                result = self.phoneKey[int(digits[index])]
            else:
                result = list(itertools.product(result, self.phoneKey[int(digits[index])]))
                result = [''.join(prod) for prod in result]
                pass
            pass
        return result

if __name__ == '__main__':
    solution = Solution()
    assert solution.letterCombinations("23") == ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
    assert solution.letterCombinations("230") == ['ad ', 'ae ', 'af ', 'bd ', 'be ', 'bf ', 'cd ', 'ce ', 'cf ']
    assert solution.letterCombinations("123") == ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
    assert solution.letterCombinations("1234") == ['adg', 'adh', 'adi', 'aeg', 'aeh', 'aei', 'afg', 'afh', 'afi', 'bdg', 'bdh', 'bdi', 'beg', 'beh', 'bei', 'bfg', 'bfh', 'bfi', 'cdg', 'cdh', 'cdi', 'ceg', 'ceh', 'cei', 'cfg', 'cfh', 'cfi']

    pass