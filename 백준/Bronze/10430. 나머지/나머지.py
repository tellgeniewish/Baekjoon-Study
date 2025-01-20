cal_value = input().split()
A = int(cal_value[0])
B = int(cal_value[1])
C = int(cal_value[2])

print((A + B) % C)
print(((A % C) + (B % C)) % C)
print((A * B) % C)
print(((A % C) * (B % C)) % C)