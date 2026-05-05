import java.util.Scanner;

class p12
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int s1,s2,s3;

		System.out.println("enetr the side 1 = ");
		s1 = s.nextInt();

		System.out.println("enetr the side 2 = ");
		s2 = s.nextInt();

		System.out.println("enetr the side 3 = ");
		s3 = s.nextInt();

		if(s1==s2 && s2==s3)
		{
			System.out.println("equilateral traingle");
		}
		else if(s1==s2 || s2==s3)
		{
			System.out.println("Isoscales traingle");
		} 
		else if(s1 == s2*s2 + s3*s3 || s2 == s3*s3+ s1*s1 || s3 == s1*s1 + s2*s2)
		{
			System.out.println("Right angle traingle");
		}
		else if(s1!=s2 && s2!=s3)
		{
			System.out.println("scalane traingle");
		}

	}
}
