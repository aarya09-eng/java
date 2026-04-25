class stdmarks
{
	public static void main(String args[])
	{
		int roll = 123;
		String name = "Aarya";
		int m1 = 99;
		int m2 = 99;
		int m3 = 99;
		int m4 = 99;
		int m5 = 99;
		int total,per;

		System.out.println("*-----STUDENT INFORMATION-----*");
		System.out.println("the roll no of the student =  "+roll);
		System.out.println("the name of the student =  "+name);
		System.out.println("M1 =  "+m1);
		System.out.println("M2 =  "+m2);
		System.out.println("M3 =  "+m3);
		System.out.println("M4 =  "+m4);
		System.out.println("M5 =  "+m5);
		total = m1+m2+m3+m4+m5;
		per = total/5;

		System.out.println("the total marks of the student =  "+total);
		System.out.println("the percentage of the student =  "+per);
	}
}