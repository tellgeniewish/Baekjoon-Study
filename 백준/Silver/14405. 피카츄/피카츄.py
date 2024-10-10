S = input()

pi_count = S.count('pi') * 2
ka_count = S.count('ka') * 2
chu_count = S.count('chu') * 3

if (len(S) == pi_count + ka_count + chu_count):
    print("YES")
else: print("NO")