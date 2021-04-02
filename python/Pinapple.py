# -*- coding: utf-8 -*-

k = int(input())

data = {}
    
for i in range(k):
    data[i] = str(input())

for q in data.items():
    q = q[1].split(" ")
    a = int(q[0])  # 總數
    b = int(q[1])  # 箱子數
    c = int(q[2])  # 小箱子可裝
    d = int(q[3])  # 大箱子可裝

    for m in range(0, b + 1):
        n = b-m
        result = m*c + n*d
        if result == a:
            print("%d %d" % (m, n))
