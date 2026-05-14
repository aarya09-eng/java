public class p3
{
	 int acc_no;
	String name;
	float balance;

	void insert(int a,String n,int b)
	{
		acc_no = a;
		name = n;
		balance = b;
	}

	void deposit(int amt)
	{
		if(amt<0)
		{
			System.out.println("inavlid amount");
		}
		else 
		{
			balance = balance + amt;
			System.out.println("New balance = "+balance);
		}
	
	}

	void withdraw(int amt)
	{
		if(amt>balance || amt<0)
		{
			System.out.println("inavlid amount");
		}
		else 
		{
			balance = balance - amt;
			System.out.println("New balance = "+balance);
		}
	
	}

	void checkbalance()
	{
		System.out.println("the total balance =  "+balance);
	}

	void display()
	{
		System.out.println("name = "+name);
		System.out.println("account number  = "+acc_no);
		System.out.println("balance = "+balance);
	}

	public static void main(String args[])
	{
		p3 p = new p3();
		p.insert(123,"aarya",100000);
		p.deposit(2000);
		p.withdraw(10000);
		p.display();
		p.checkbalance(); 
	}

}