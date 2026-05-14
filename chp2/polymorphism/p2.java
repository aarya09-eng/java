class Adder
{
	static int sum(int a,int b)
	{
		return a+b;
	}

	static int sum(int a,int b,int c)
	{
		return a+b+c;
	}
}

class p2
{
	public static void main(String args[])
	{
		Adder a = new Adder();
		System.out.println(" "+a.sum(10,20));
		System.out.println(" "+a.sum(10,20,30));
	}
}