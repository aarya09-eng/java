import java.util.Scanner; 

class p8
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int year;

		System.out.print("enetr the year = ");
		year = s.nextInt();

		if(year%4==0 && year%400==0)
		{
			System.out.println(" "+year+" is an leap year");
		}
		else 
		{
			System.out.println(" "+year+" is not a leap year");
		}
	}

}