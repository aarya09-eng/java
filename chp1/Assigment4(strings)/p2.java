import java.util.Scanner;

class p2
{
	public static void main()
	{
		Scanner s = new Scanner(System.in);

		String name = "Aarya";
		int age = 20;
		long phone = 93443555L;
		String lang = "Java";
		float per = 99.99F;

		String output = String.format("My name is %s.\ni am %d years old.\nmy contact number is %d.\ni have selected %s as my programming language.\nI got %f in my examination.",name,age,phone,lang,per); 

		System.out.print(output.toString());
	}
}