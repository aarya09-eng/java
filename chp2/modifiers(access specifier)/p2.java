class circle
{
	int r,h;
	private double pi = 3.14;
	private int a = 10;

	public double area(double r)
	{
		return(pi*r*r);
	}
	public double volume(double r,double h)
	{
		return 2*pi*r*h;
	}
}

class p2
{
    public static void main(String args[])
    {
        circle c = new circle();

        double a = c.area(2);
        double v = c.volume(2,4);

        System.out.println("the area of circle = "+a);
        System.out.println("the volume of circle = "+v);
    }
}