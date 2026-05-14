class test_emp
{
	int id;
	String name;
	float salary;

	void insert(int i,String n,float s)
	{
		id = i;
		name = n;
		salary = s;
	}

	void display()
	{
		System.out.println("name = "+name);
		System.out.println("Id  = "+id);
		System.out.println("Salary = "+salary);
	}
}

public class p4
{
	public static void main(String args[])
	{
		test_emp p1 = new test_emp();
		test_emp p2 = new test_emp();
		test_emp p3 = new test_emp();


		p1.insert(123,"aarya",100000);
		p1.display();
		p2.insert(124,"sakshi",90000);
		p2.display();		
		p3.insert(125,"rutuja",25435);
		p3.display();

	}
} 