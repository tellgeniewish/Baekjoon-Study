pcs = input().split(' ')

N = int(pcs[0])
M = int(pcs[1])

s = list(map(int, input().split()))

for i in range(1, M + 1):
    a,b,c = list(map(int, input().split()))
    if a == 1:
        s[b - 1] = c
    elif a == 2:
        for i in range(b - 1, c):
            if s[i] == 0:
                s[i] = 1
            else: s[i] = 0
    elif a == 3:
        for i in range(b - 1, c):
            s[i] = 0
    elif a == 4:
        for i in range(b - 1, c):
            s[i] = 1

result = ' '.join(map(str, s))
print(result)