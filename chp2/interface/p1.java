interface printable
{
    void print();
}

interface showable
{
    void show();
}

class p1 implements printable,showable
{
    public void print()
    {
        System.out.println("hello");
    }

    public void show()
    {
        System.out.println("world");
    }

    public static void main(String args[])
    {
        p1 p = new p1();
        p.print();
        p.show();
    }
}