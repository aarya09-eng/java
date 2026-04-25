import java.util.Scanner;

class traingle
{
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);
		float l,h,area;

		System.out.println("enetr the lenght ");
		l = s.nextFloat();

		System.out.println("enetr the breath = ");
		h = s.nextFloat();

		area = 0.5F*l*h;
		
		System.out.println("the area of triangle = " +area);
	}
}