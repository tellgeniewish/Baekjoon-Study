N, M = list(map(int, input().split()))

basket = []
for i in range(N + 1):
    basket.append(i)

for i in range(M):
    a, b = list(map(int, input().split()))

    temp = basket[a]
    basket[a] = basket[b]
    basket[b] = temp

for i in range(1, N + 1):
    print(basket[i], end=' ')