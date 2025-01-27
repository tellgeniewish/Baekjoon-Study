dice = list(map(int, input().split()))

money = 0
if ((dice[0] == dice[1]) and (dice[1] == dice[2])):
    money = 10000 + dice[0] * 1000
elif ((dice[0] != dice[1]) and (dice[1] != dice[2]) and (dice[2] != dice[0])):
    m = max(dice)
    money = m * 100
else:
    if (dice[0] == dice[1]):
        money = 1000 + dice[0] * 100
    elif (dice[1] == dice[2]):
        money = 1000 + dice[1] * 100
    else:
        money = 1000 + dice[2] * 100

print(money)