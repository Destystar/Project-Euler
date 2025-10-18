using System;
//Floyd's cycle detection algorithm

class Program
{
    static int GetCycleLength(int d)
    {
        if (d % 2 == 0 || d % 5 == 0)
            return 0;
        
        int a = 1;
        int b = 1;
        
        do
        {
            a = (a * 10) % d;  
            b = (b * 10) % d;          
            b = (b * 10) % d;          
        } while (a != b);
        
        int cycleLength = 0;
        do
        {
            a = (a * 10) % d;
            cycleLength++;
        } while (a != b);
        
        return cycleLength;
    }
    
    static void Main()
    {
        int maxCycleLength = 0;
        int bestD = 0;
        
        for (int d = 2; d < 1000; d++)
        {
            int cycleLength = GetCycleLength(d);
            if (cycleLength > maxCycleLength)
            {
                maxCycleLength = cycleLength;
                bestD = d;
            }
        }
        
        Console.WriteLine($"The number d < 1000 with the longest recurring cycle is: {bestD}");
        Console.WriteLine($"Cycle length: {maxCycleLength}");
    }
}