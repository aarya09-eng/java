class A 
{
	void msg()
	{
		System.out.println("hello!");
	}
}

class B extends A 
{
	void msg()
	{
		super.msg();
		System.out.println("welcome");
	}
}

class p4
{
	public static void main(String args[])
	{
		B b = new B();
		b.msg();
		b.msg();
	}
}