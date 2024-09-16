N = int(input())
pattern = input()
temp = pattern.split('*')

for i in range(N):
    str = input()

    if len(str) < len(pattern) - 1:
        print("NE")
    else:
        if temp[0] == str[:len(temp[0])] and temp[1] == str[-len(temp[1]):]:
            print("DA")
        else: print("NE")