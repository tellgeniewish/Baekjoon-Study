value = input()

length = len(value)

for i in range(length // 2):
    if (value[i] != value[length -i - 1]):
        print(0)
        break
    
else:
    print(1)