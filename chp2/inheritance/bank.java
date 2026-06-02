class Bank1 
{
	int rate()
	{
		return 0;
	}
}

class SBI extends Bank1
{
	int rate()
	{
		return 7;
	}
}

class ICIC extends Bank1
{
	int rate()
	{
		return 8;
	}
}

class AXIS extends Bank1
{
	int rate()
	{
		return 9;
	}
}

class Bank
{
	public static void main(String args[])
	{
		SBI s = new SBI();
		AXIS a = new AXIS();
		ICIC i = new ICIC();

		System.out.println("the intrest amount at  SBI = "+s.rate());
		System.out.println("the intrest amount at AXIS = "+a.rate());
		System.out.println("the intrest amount at ICIC = "+i.rate());
	}
}