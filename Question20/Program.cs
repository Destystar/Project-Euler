using System.Numerics;

BigInteger factorial(int n)
{
    if (n == 0)
        return 1;
    else
        return n * factorial(n - 1);
}

BigInteger number = factorial(100);
string numberStr = number.ToString();
int sum = 0;
for (int i = 0; i < numberStr.Length; i++)
{
    sum += int.Parse(numberStr[i].ToString());
}
Console.WriteLine(sum);