def make_name(length, over, fir, sec):
    name = []
    for i in range(over):
        if i < length:
            name.append(fir[i])
            name.append(sec[i])
        elif over == M:
            name.append(sec[i])
        else:
            name.append(fir[i])
    return name
    #print(make_name)
    # print(type(make_name))
    # print(len(make_name))
    # print(i)

def make_index(name):
    i = 0
    index_list = []
    alpha = []
    while i < len(name):
        index_list.append(ord(name[i]) - ord('A'))
        #print(index_list)
        alpha.append(value[index_list[i]])
        i += 1
    #print("idx=", index_list)
    #print("alpha=", alpha)
    return alpha

def calc_to_alpha(alpha):
    # print("in def alpha=", alpha)
    # print(len(alpha))
    str = alpha
    # print("str=", str)
    # print("type=", type(str))
    cnt = []
    # print("str=", str)
    for i in range(len(str) - 1):
        # print(i, alpha[i], alpha[i + 1])
        cnt.append((alpha[i] + alpha[i + 1]) % 10)
        # print("cnt=", cnt)
    str = cnt
    # print("str=", str)
    amount = calc_amount(str)

    return amount

def calc_amount(str):
    #amount = 0
    while 2 < len(str):
        amount = []
        # print("str=", str)
        for i in range(len(str) - 1):
            # print(i, str[i], str[i + 1])
            amount.append((str[i] + str[i + 1]) % 10)
            # print("amount=", amount)
        str = amount
    
    return amount

value = [3, 2, 1, 2, 4, 3, 1,
       3, 1, 1, 3,
       1, 3, 2, 1, 2,
       2, 2, 1, 2, 1,
       1, 1, 2, 2, 1]

length = input().split()
#print("출력=", length)
N = int(length[0])
M = int(length[1])

input_name = input().split()
fir = input_name[0]
sec = input_name[1]
#print(fir, sec)

if N < M:
    length = N
    over = M
else:
    length = M
    over = N

name = make_name(length, over, fir, sec)

alpha = make_index(name)
#print("alpha=", alpha)

percentage = calc_to_alpha(alpha)

if percentage[0] == 0:
    print(percentage[1], "%", sep='')
else:
    print(percentage[0], percentage[1], "%", sep='')