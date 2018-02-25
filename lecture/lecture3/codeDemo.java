
public class codeDemo {
	public int first;
	public IntList L;

	public IntList(int f, IntList r)
	{
		first = f;
		rest = r;
	}
	
	//Return the size of the list using recursion
	public int size()
	{
		if (rest == null)
		{
			return 1;
		}
		return 1 + this.rest.size(); //'this'


	}

// Using iterative method 'size()'
	public int size()
	{
		int totalSize = 0;
		IntList p = this;
		while(p != null)
		{
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;

	}


	public int get(int i)
	{
		if(i == 0)
		{
			return first;
		}
		return rest.get(i-1);
	}


	public static void main(String[] args){
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.size());
		}
	}	
}