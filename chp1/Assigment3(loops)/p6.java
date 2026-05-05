import java.util.Scanner;

class p6
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int start,end;

		System.out.println("enter the start number = ");
		start = s.nextInt();

		System.out.println("enter the end number = ");
		end = s.nextInt();

		for(int i=start;i<=end;i++)
		{
			System.out.println(" "+i);
		}
	}
}