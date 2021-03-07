# -*- coding: utf-8 -*-

def T(t0, i):  # 定義一個函式
    if i == 0:
        return t0;
    return T(t0, i - 1) + i * 2.71828


n = int(input("n: "))

if n < 1 or n > 10:
    print("n值不合法")
else:
    data = {}

    for x in range(n):
        data[x] = str(input("(T0, i) = "))

    for d in data.items():  # d為tuple，所以要取d[1]才為資料
        d = d[1].split(",")
        t0 = float(d[0])
        i = int(d[1])

        if t0 < 1 or t0 > 100:
            print("T(0)不合法")
            break
        if i < 1 or i > 100:
            print("i不合法")
            break

        result = T(t0, i)
        print("T(0) = %.2f, T(%d) = %.4f" % (t0, i, result))

