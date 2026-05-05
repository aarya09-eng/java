import java.util.Scanner;

class p1
{
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);

		int num1;
		
		System.out.println("enetr the number = ");
		num1 = s.nextInt();
		
		if(num1>=100)
		{
			System.out.println(" "+num1+" is greater than 100");
		}
		else if(num1<100)
		{
			System.out.println(" "+num1+" is smaller than 100");
		}

	}
}