a, b, c = list(map(int, input().split()))

if (a == b == c): 
    print(10000 + a * 1000)
elif (a != b and b != c and a != c):
    print(max(a, b, c) * 100)
elif (a == b or a == c):
    print(1000 + a * 100)
else: print(1000 + b * 100)