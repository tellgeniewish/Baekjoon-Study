N = int(input())

cost = []
for i in range(N):
    cost.append(int(input()))

cost.sort(reverse=True)

sum = 0
for i in range(N):
    if i % 3 != 2:
        sum += cost[i]
print(sum)