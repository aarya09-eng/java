import java.util.Scanner;
class class2{

	int roll;  // data members
	String name;
	Scanner sc;  // declrearing
	

	void get()		// Member function
	{
		sc = new Scanner(System.in);  // Init

		System.out.println("Enter The Name And roll:");
		name = sc.nextLine();	//string
		roll = sc.nextInt();		//int

	}
	void show()
	{
			System.out.println("The Name : "+name);
			System.out.println("The Roll : "+roll);
	}

	

	public static void main(String args[])
	{

		class1 c1 = new class1();
		c1.get();
		c1.show();
	}


}