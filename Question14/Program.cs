long longest = 0;
long longestStartingNumber = 0;
for (int i = 1; i < 1000000; i++)
{
    long count = 1;
    long temp = i;
    while (temp != 1)
    {
        if (temp % 2 == 0)
        {           
            temp /= 2;
        }
        else
        {
            temp = 3 * temp + 1;
        }
        count++;
    }
    if (count > longest)
    {
        longest = count;
        longestStartingNumber = i;
    }
}

Console.WriteLine(longest);
Console.WriteLine(longestStartingNumber);