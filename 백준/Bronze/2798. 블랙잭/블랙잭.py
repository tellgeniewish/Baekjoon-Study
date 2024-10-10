count = input().split(' ')

N = int(count[0])
M = int(count[1])

num = list(map(int, input().split()))

result = 0
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            if M < num[i] + num[j] + num[k]:
                continue
            else:
                result = max(result, num[i] + num[j] + num[k])

print(result)