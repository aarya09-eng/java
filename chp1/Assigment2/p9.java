import java.util.Scanner ;

class p9
{
	public static void main()
	{
		Scanner s = new Scanner(System.in);

		int num;

		System.out.print("enetr the number = ");
		num = s.nextInt();

		if(0<=num && num<=9)
		{
			System.out.println(" "+num+" is an single digit number");
		}
		else if(10<=num && num<=99)
		{
			System.out.println(" "+num+" is an double digit number");
		}
		else if(num>99)
		{
			System.out.println(" "+num+" is an more than two digit number");
		}
	} 
}