interface Drawable
{
    void draw();
}

class Rectangle implements Drawable 
{
    public void draw()
    {
        System.out.println("drawing rectangle..");
    }
}

class circle implements Drawable 
{
    public void draw()
    {
        System.out.println("drawing circle..");
    }
}

class p2
{
    public static void main(String args[])
    {
        Drawable d;
        d = new circle();
        d.draw();
        d = new Rectangle();
        d.draw();
    }
}