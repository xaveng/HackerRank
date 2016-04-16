#!/bin/python3

import sys

t = int(input().strip())
for a0 in range(t):
	n = int(input().strip())
	temp = n
	while temp % 3 != 0 and temp >= 0:
		temp -= 5
		pass
	if temp < 0:
		print('-1')
	else:
		print(temp * '5' + (n - temp) * '3')