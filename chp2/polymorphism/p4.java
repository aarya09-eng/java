// super keyword 

class animal 
{
	String color = "black"; 
}

class dog extends animal 
{
	String color = "brown";

	void printcolor()
	{
		System.out.println(" "+color);
		System.out.println(" "+super.color);
	} 
}

class p4
{
	public static void main(String args[])
	{
		dog d = new dog();

		d.printcolor();
	}
}