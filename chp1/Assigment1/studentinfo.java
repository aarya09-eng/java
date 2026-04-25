import java.util.Scanner;

class studentinfo
{
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);
		int roll;
		String name;
		String contact;
		int total;
		int per; 

		System.out.println("enetr the roll no ");
		roll = s.nextInt();
		s.nextLine();

		System.out.println("enetr the name = ");
		name = s.nextLine();

		System.out.println("enetr the mobile no ");
		contact = s.nextLine();

		System.out.println("enetr the total marks = ");
		total = s.nextInt();

		System.out.println("enetr the percentage ");
		per = s.nextInt();


		System.out.println("*-----STUDENT INFORMATION-----*");
		System.out.println("the roll no of the student =  "+roll);
		System.out.println("the name of the student =  "+name);
		System.out.println("the contact no of the student =  "+contact);
		System.out.println("the total marks of the student =  "+total);
		System.out.println("the percentage of the student =  "+per);		
	}
}