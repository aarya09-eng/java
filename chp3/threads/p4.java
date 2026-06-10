class p4 extends Thread
{
    public void run()
    {
        System.out.println("task1");
        System.out.println("task2");
        System.out.println("task3");
        System.out.println("task4");
        System.out.println("task5");
    }

    public static void main(String args[])
    {
        p4 p = new p4();
        p.start();

        p4 p1 = new p4();
        p1.start();
    }
}