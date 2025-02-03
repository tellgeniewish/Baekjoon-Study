keyword = input()

string = ""
for i in range(len(keyword) - 1):
    if (keyword[i] != keyword[i + 1]):
        string += keyword[i]
string += keyword[len(keyword) - 1]

print(string)