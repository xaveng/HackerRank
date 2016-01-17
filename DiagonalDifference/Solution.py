# -*- coding: utf-8 -*-
'''
Created on 2016. 1. 17.

@author: SeoJeong
'''

'''
Given a square matrix of size N×N, calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is: 
11
      5
            -12

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
            4
      5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15
'''

def matrixElementDiff(values, left, right):
    if left == right:
        return 0
        pass
    return values[left] - values[right]
    pass

if __name__ == '__main__':
    count = int(input())
    # print (count)
    left = 0
    right = count - 1
    result = 0
    for row in range(0, count):
        result += matrixElementDiff(list(map(int, input().split())), left, right)
        left += 1
        right -= 1
        pass
    print(abs(result))
    pass

