class mythread1 extends Thread 
{
    public void run()
    {
        System.out.println("Writing....");
    }
}

class mythread2 extends Thread 
{
    public void run()
    {
        System.out.println("Reading....");
    }
}

class mythread3 extends Thread 
{
    public void run()
    {
        System.out.println("Speaking....");
    }
}

class mythread4 extends Thread 
{
    public void run()
    {
        System.out.println("Singing....");
    }
}

class p5
{
    public static void main(String args[])
    {
        mythread1 t1 = new mythread1();
        t1.start();
        mythread2 t2 = new mythread2();
        t2.start();
        mythread3 t3 = new mythread3();
        t3.start();
        mythread4 t4 = new mythread4();
        t4.start(); 
    }
}