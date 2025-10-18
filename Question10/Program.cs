bool isPrime (int n)
{
    if (n <= 1) return false;
    for (int i = 2; i <= Math.Sqrt(n); i++)
    {
        if (n % i == 0) return false;
    }
    return true;
}

long sum = 0;
for (int i = 0; i < 2000000; i++)
{
    if (isPrime(i))
    {
        sum += i;
    }
}

System.Console.WriteLine(sum);