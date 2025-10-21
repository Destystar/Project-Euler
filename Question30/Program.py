sum = 0
for i in range(999999):
    tempSum = 0;
    a = str(i)
    for digit in a:
        tempSum += int(digit) ** 5
    if tempSum == i:
        sum += i
    
sum -= 1  
print(sum)