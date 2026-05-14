class employee
{
	int salary = 100000;
}

class p1 extends employee
{
	int bonus = 10000;

	public static void main(String args[])
	{
		p1 e = new p1();

		int t = e.salary + e.bonus;
		
		System.out.println("the employee salary = "+e.salary);
		System.out.println("the programmer salary = "+e.bonus);

		System.out.println("the total salary = "+t);
	}
}