using System.Numerics;

HashSet<long> sums = new HashSet<long>();
List<long> primes = new List<long>();

bool[] isPrime = new bool[7072];
for (int i = 2; i < 7072; i++) isPrime[i] = true;

for (int i = 2; i * i < 7072; i++)
{
    if (isPrime[i])
    {
        for (int j = i * i; j < 7072; j += i)
        {
            isPrime[j] = false;
        }
    }
}

for (int i = 2; i < 7072; i++)
{
    if (isPrime[i])
    {
        primes.Add(i);
    }
}

long[] squares = new long[primes.Count];
long[] cubes = new long[primes.Count];
long[] fourths = new long[primes.Count];

for (int i = 0; i < primes.Count; i++)
{
    squares[i] = primes[i] * primes[i];
    cubes[i] = primes[i] * primes[i] * primes[i];
    fourths[i] = primes[i] * primes[i] * primes[i] * primes[i];
}


for (int i = 0; i < primes.Count; i++)
{
    if (squares[i] >= 50000000) break; 
    
    for (int j = 0; j < primes.Count; j++)
    {
        if (squares[i] + cubes[j] >= 50000000) break; 
        
        for (int k = 0; k < primes.Count; k++)
        {
            long sum = squares[i] + cubes[j] + fourths[k];
            if (sum >= 50000000) break; 
            
            sums.Add(sum); 
        }
    }
}

Console.WriteLine(sums.Count);