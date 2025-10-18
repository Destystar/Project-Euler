a = 600851475143
b = 2
c = 0

while a > 1:
    if a % b == 0:
        a //= b
        c = b
    else:
        b += 1
print(c)