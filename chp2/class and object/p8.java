class Student
{
	int roll;
	String name;
}

public class p8
{
	public static void main(String args[])
		{
			Student s1 = new Student();
			Student s2 = new Student();

			s1.roll = 123;
			s1.name = "aarya";
			System.out.println(s1.roll);
			System.out.println(s1.name);

			s2.roll = 124;
			s2.name = "abc";
			System.out.println(s2.roll);
			System.out.println(s2.name);
		}
}