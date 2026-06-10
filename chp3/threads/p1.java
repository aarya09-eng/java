/**
 * This Java class extends Thread and prints "hello world!" when the thread is started.
 */
class p1 extends Thread
{
    public void run()
    {
        System.out.println("hello world!");
    }

    public static void main(String args[])
    {
        p1 p = new p1();
        p.start();
    }
}