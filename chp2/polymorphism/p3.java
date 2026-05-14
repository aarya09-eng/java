class Adder 
{
	static int sum(int a,int b)		
	{
		return a+b;
	}

	static double sum(float a,float b)
	{
		return a+b;
	}

	static double sum(double a,double b)
	{
		return a+b;
	}
}

class p3
{
	public static void main(String args[])
	{	
		Adder a = new Adder();

		System.out.println(" "+a. sum(3,3));
		System.out.println(" "+ a.sum(3.4F,34.5F));
		System.out.println(" "+ a.sum(3456D,39854389D));
	}
}