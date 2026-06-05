import java.util.Scanner;

class Bank
{
	private double bal = 5000;
	private int pwd;

	public void deposit(double money)	
	{
		System.out.println("enter password ");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();

		if(pwd == 123)
		{
			bal = money + bal;
			System.out.println("the money deposit= "+money);
			System.out.println("the balance = "+bal);
		}
		else 
		{
			System.out.println("Incorrect password!");
		}
	}

	public void withdraw(double money)	
	{
		System.out.println("enter password ");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();

		if(pwd == 123 && bal>money)
		{
			bal = bal - money;
			System.out.println("the money withdraw = "+money);
			System.out.println("the balance = "+bal);
		}
		else 
		{
			System.out.println("Incorrect password!");
		}

	}

	public void checkbal()	
	{
		System.out.println("enter password ");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();

		if(pwd == 123 )
		{
			System.out.println("the balance = "+bal);
		}
		else 
		{
			System.out.println("Incorrect password!");
		}

	}
}

class p1
{
	public static void main(String args[])
	{
		Bank b = new Bank();
		int choice;
		System.out.println("1.Deposit");
		System.out.println("2.withdraw");
		System.out.println("3.calculate balance");
		System.out.println("Enter your choice = ");
		
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();

		switch(choice)
		{
			case 1:
				b.deposit(1000);
				break;

			case 2:
				b.withdraw(4000);
				break;
			
			case 3:
				b.checkbal();
				break;

			default:
				System.out.println("Invalid input!");
		}	
	}
}