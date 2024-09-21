S = input()
K = input()

real = []
for i in range(len(S)):
    if S[i].isalpha():
        real.append(S[i])

real_str = ''.join(real)
# print(real_str)
# print(type(real_str))
check = real_str.count(K)

if check == 0:
    print(0)
else: print(1)