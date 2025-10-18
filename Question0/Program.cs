long sum = 0;
for (int i = 1; i <= 323000; i++)
{
    long temp = (long)i * i;
    if (temp % 2 != 0)
    {
        sum += temp;
    }
}
System.Console.WriteLine(sum);