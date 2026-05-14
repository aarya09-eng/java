class Animal 
{
	void eat()
	{
		System.out.println("Eating....");
	}
}

class dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}

class cat extends dog
{
	void meow()
	{
		System.out.println("meow....");
	}
}

class p3
{
	public static void main(String args[])
	{
		cat c = new cat();
		c.bark();
		c.meow();
		c.eat();
	}	 
}