# -*- coding: utf-8 -*-

def T(t0, i):         # 定義一個函式 變數型態(資料型態)TO是浮點數 i是整數 
    if i == 0:        # 遞回函式要有一個停止的條件
        return t0;
    return T(t0, i - 1) + i * 2.71828 

n = int(input())

# if n < 1 or n > 10:    
#     print("n值不合法")
# else:
data = {}                   # 字典的資料結構 data = {x : 'value'}
                            # data[x] 會跑出 (0, value)
for x in range(n):
    data[x] = str(input())  # 把第X個item設成字串 t0,i 轉成字串 因為預設的會變成tuple

for d in data.items():      # d為tuple，所以要取d[1]才為資料
# d = d.split(',')          # tuple 不能做這個，沒有split() function
    d = d[1].split(",")     # d = [1, 2] 不能取第0個值
    t0 = float(d[0])        # 1
    i = int(d[1])           # 2

#         if t0 < 1 or t0 > 100:
#             print("T(0)不合法")
#             break
#         if i < 1 or i > 100:
#             print("i不合法")
#             break

    result = T(t0, i)                             # result 處理遞回函式的變數
    print(str(result)[:str(result).find('.')+5])  # 把result變成字串,[後面是0:小數點
