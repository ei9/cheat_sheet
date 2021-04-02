# -*- coding: utf-8 -*-

def killTree(n, k):
    if n < 1:
        return k
    return killTree(n-1, (k+1)*2)

aa=int(input())

for s in range(0, aa):
    nm,cc = list(map(int,input().split(" ")))
    print("%d" % killTree(nm,cc))
