from collections import Counter, OrderedDict
import math
import os
import random
import re
import sys

class OrderedCounter(Counter, OrderedDict):
   pass

def logo(s):
    s = list(s)
    s.sort()
    [print(*c) for c in OrderedCounter(s).most_common(3)]

if __name__ == '__main__':
    x = {1: 2, 3: 4, 4: 3, 2: 1, 0: 0}
    sorted_x = sorted(x.items(), key=lambda kv: kv[1],reverse=True)
    print(sorted_x)
    s = 'bbbaaaccdddd'
    logo(s)



