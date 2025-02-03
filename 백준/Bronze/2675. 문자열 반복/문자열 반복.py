T = int(input())

for i in range(T):
    S = input().split()
    R = int(S[0])
    for char in S[1]:
        print(char * R, end="")
    print()