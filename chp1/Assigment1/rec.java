import java.util.Scanner;

class rec
{
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);

		int l,b,area;
		
		System.out.println("enetr the lenght ");
		l = s.nextInt();

		System.out.println("enetr the breath = ");
		b = s.nextInt();

		area = l*b;
		
		System.out.println("the area of rectangle = "+area);
	}
}