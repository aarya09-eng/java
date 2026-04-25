import java.util.Scanner;

class emp
{
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);
		int id;
		String name;
		float bsalary;
		float da,hra,ta,gross,itax,net;

		System.out.println("enetr the id no =  ");
		id = s.nextInt();
		s.nextLine();

		System.out.println("enetr the name = ");
		name = s.nextLine();

		System.out.println("enetr the bsalary =  ");
		bsalary = s.nextInt();

		da = bsalary*0.05f;
		hra = bsalary*0.12f;
		ta = bsalary*0.08f;
		gross = bsalary+da+hra+ta;
		itax = bsalary*0.10f;
		net = gross-itax;

		System.out.println("*-----STUDENT INFORMATION-----*");
		System.out.println("the id of the employee =  "+id);
		System.out.println("the name of the employee =  "+name);
		System.out.println("the basic salary of the employee =  "+bsalary);
		System.out.println("the da of the employee =  "+da);
		System.out.println("the hra of the employee =  "+hra);
		System.out.println("the ta of the employee =  "+ta);
		System.out.println("the gross salary of the employee =  "+gross);
		System.out.println("the itax of the employee =  "+itax);
		System.out.println("the net salary of the employee =  "+net);
	}
}