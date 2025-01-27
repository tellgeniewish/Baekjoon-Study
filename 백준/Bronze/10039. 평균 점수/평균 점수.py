score = 0
for i in range(5):
    value = int(input())
    if (value < 40):
        score += 40
    else:
        score += value
avg = score // 5
print(avg)