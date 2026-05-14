class rectangle
{
	int lenght;
	int breath;

	void insert(int l,int b)
	{
		lenght = l;
		breath = b;
	}

	void display()
	{
		System.out.println("the area of rectangle = "+(lenght*breath));
	}
}

public class p5
{
	public static void main(String args[])
	{
		rectangle p1 = new rectangle();
		rectangle p2 = new rectangle();
		rectangle p3 = new rectangle();


		p1.insert(10,2);
		p1.display();
		p2.insert(4,6);
		p2.display();		
		p3.insert(2,5);
		p3.display();

	}
} 