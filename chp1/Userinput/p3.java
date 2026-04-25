import java.util.Scanner;
class p3{
		// string nextLine()  char nextChar() float nextFloat()
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int a,b,c;

		System.out.println("Enter The Value For A:");
		a = sc.nextInt();
		
		System.out.println("Enter The Value For B:");
		b = sc.nextInt();

		c = a+b;
		
		System.out.print("Sum = "+c);

	}

}