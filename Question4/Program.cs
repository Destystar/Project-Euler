int first = 100;
int second = 100;
int largest = 0;

for (int i = 0; i < 900; i++)
{
    second = 100;
    for (int j = 0; j < 900; j++)
    {
        int product = first * second;
        string productString = product.ToString();
        string reversedString = new string(productString.Reverse().ToArray());
        if (productString == reversedString && product > largest)
        {
            largest = product;
        }
        second++;
    }
    first++;
}

Console.WriteLine(largest);