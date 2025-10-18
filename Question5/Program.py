import math

def lcm(a,b):
    return abs(a*b) // math.gcd(a,b)

a = 1
for i in range(2,21):
    a = lcm(a,i)
print(a)

