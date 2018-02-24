public static int Fib(int n)
{
	if (n <= 1)
		return n;
	return Fib(n - 1) + Fib(n - 2);
}

//Using the iteration
public static int fib(int n)
{
	int f0 = 0;
	int f1 = 1;
	while(n > 0)
	{
		int result = f1;
		f1 = f1 + f0;
		f0 = result;
		n -= 1;
	}
	return f0;
}


//Efficient way
public static int fib(int n, int k, int f0, int f1)
{
	if (n == k)
	{
		return f0;

	}
	else
	{
		return fib(n, k+1, f1, f0+f1);
	}
}