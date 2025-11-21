N = int(input())
target = int(input())

arr = [[0]*N for _ in range(N)]

# 오른쪽(0, 1), 왼쪽(0, -1)
# 아래(1, 0), 위(-1, 0)
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1] 

x, y = 0, 0
direction = 0

num = N*N
while 0 < num:
    arr[x][y] = num

    if target == num:
        target_x = x + 1
        target_y = y + 1

    # 다음 위치 계산
    nx = x + dx[direction]
    ny = y + dy[direction]

    if nx < 0 or N <= nx or ny < 0 or N <= ny or arr[nx][ny] != 0:
        direction = (direction + 1) % 4
        nx = x + dx[direction]
        ny = y + dy[direction]

    x, y = nx, ny
    num -= 1

for row in arr:
    for num in row:
        print(num, end=' ')
    print()
print(target_x, target_y)