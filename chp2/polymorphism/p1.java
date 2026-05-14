class num
{
	static void sum()
	{
		System.out.println("Addition");
	}

	static void sum(int n)
	{
		System.out.println("the number = "+n);
	} 

	static void sum(int a,int b)
	{
		System.out.println("the sum  = "+(a+b));	
	}
}

class p1
{
	public static void main(String args[])
	{
		num p = new num();
		p.sum();
		p.sum(10);
		p.sum(10,20);
	}
}