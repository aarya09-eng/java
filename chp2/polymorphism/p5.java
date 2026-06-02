import java.util.Scanner ;

class Animal 
{
	void bark()
	{
		System.out.println("Barking.....");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog Barking.........");
	}

	void sound()
	{
		System.out.println("Animal.....");
	}

	void work()
	{
		super.bark();
		sound();
	}
}

class p5
{
	public static void main(String args[])
	{
		Dog d = new Dog();

		d.work();
	}
}