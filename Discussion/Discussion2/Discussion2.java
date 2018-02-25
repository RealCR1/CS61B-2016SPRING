public class Discussion2 {
/*
This is non-destructive way.
*/	

	// Using recursion
	public static IntList square(IntList L)
	{
		if(L == null)
		{
			return L;
		}
		else
		{
			IntList rest = square(L.rest);
			IntList M = new IntList(L.first * L.first, rest);
			return M;
		}

	}

	//Using the iteration.
	public static IntList square(IntList L)
	{
		if(L == null)
		{
			return L;
		}
		IntList B = L.rest;
		IntList LSquared = new IntList(L.first * L.first, null);
		IntList C = LSquared;
		while(B != null)
		{
			C.rest = new IntList(B.first * B.first, null);
			B = B.rest;
			C = C.rest;
		}
		return LSquared;

	}
