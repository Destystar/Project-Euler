word = []

for i in range (1, 250000):
    word += str(i)

indexes = [1, 10, 100, 1000, 10000, 100000, 1000000]
result = 1

for index in indexes:
    result *= int(word[index - 1])

print(result)