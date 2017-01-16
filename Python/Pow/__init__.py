class Solution(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        n = int(n)
        if n == 0:
            return 1
        if x == 0:
            return x
        if n < 0:
            n = -n
            x = 1 / x
            pass

        return self.myPow(x * x, n / 2) if n % 2 == 0 \
            else x * self.myPow(x * x, n / 2)


if __name__ == '__main__':
    solution = Solution()

    assert solution.myPow(1, 1) == 1
    assert solution.myPow(2, 2) == 4
    assert solution.myPow(4, 0) == 1
    assert solution.myPow(2, -2) == 0.25
