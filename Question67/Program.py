def load_triangle(filename):
    triangle = []
    with open(filename, 'r') as file:
        for line in file:
            row = [int(x) for x in line.strip().split()]
            triangle.append(row)
    return triangle

def max_path_sum(triangle):
    n = len(triangle)
    dp = [row[:] for row in triangle]
    for i in range(n - 2, -1, -1):
        for j in range(len(triangle[i])):
            dp[i][j] += max(dp[i + 1][j], dp[i + 1][j + 1])
    return dp[0][0]

triangle = load_triangle('0067_triangle.txt')
print(max_path_sum(triangle))
