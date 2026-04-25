import java.util.Scanner; 

class p6
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int n;

		System.out.print("enetr the number = ");
		n = s.nextInt();

		if(n%5==0 && n%7==0)
		{
			System.out.println(" "+n+" is divisible by both 5 and 7");
		}
		else 
		{
			System.out.println(" "+n+" is not divisible by both 5 and 7");
		}
	}

}