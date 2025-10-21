using System.Numerics;

BigInteger sum = 1; 

for (int n = 3; n <= 1001; n += 2)
{
    BigInteger nSquared = (BigInteger)n * n;
    sum += nSquared; 
    sum += nSquared - (n - 1);   
    sum += nSquared - 2 * (n - 1); 
    sum += nSquared - 3 * (n - 1); 
}

Console.WriteLine(sum);