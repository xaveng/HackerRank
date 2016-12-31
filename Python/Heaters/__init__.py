# https://leetcode.com/problems/heaters/
from bisect import bisect_left


class Solution(object):
    def findRadius(self, houses, heaters):
        """
        :type houses: List[int]
        :type heaters: List[int]
        :rtype: int
        """
        heaters.sort()
        nHeaters = len(heaters)
        maxValue = 0
        for location in houses:
            index = bisect_left(heaters, location)

            candidates = []
            if index != 0:
                candidates.append(heaters[index - 1])
                pass
            if index < nHeaters - 1:
                candidates.append(heaters[index + 1])
                pass
            if index < nHeaters:
                candidates.append(heaters[index])
                pass
            maxValue = max(maxValue, min(map(lambda x: abs(x - location), candidates)))
            pass
        return maxValue

if __name__ == '__main__':
    solution = Solution();
    assert solution.findRadius([1, 2, 3], [2]) == 1
    assert solution.findRadius([1, 2, 3, 4], [1, 4]) == 1
    assert solution.findRadius([1, 5], [2]) == 3
