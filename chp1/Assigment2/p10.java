import java.util.Scanner;

class p10
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);		

		int n1,n2,n3;

		System.out.println("enetr the number = ");
		n1 = s.nextInt();

		System.out.println("enetr the number = ");
		n2 = s.nextInt();

		System.out.println("enetr the number = ");
		n3 = s.nextInt();

		if(n1>n2 && n1>n3)
		{
			System.out.println(" "+n1+" is the greatest number");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println(" "+n2+" is the greatest number");
		} 
		else 
		{
			System.out.println(" "+n3+" is the greatest number");
		}


		if(n1<n2 && n1<n3)
		{
			System.out.println(" "+n1+" is the smallest number");
		}
		else if(n2<n1 && n2<n3)
		{
			System.out.println(" "+n2+" is the smallest number");
		} 
		else 
		{
			System.out.println(" "+n3+" is the smallest number");
		}

	}
}