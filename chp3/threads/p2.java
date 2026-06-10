/**
 * The class "p2" implements the Runnable interface to print "hello world" when run as a separate
 * thread.
 */
class p2 implements Runnable
{
    public void run()
    {
        System.out.println("hello world");
    }

    public static void main(String args[])
    {
        p2 p = new p2();
        Thread th = new Thread(p);
        th.start();
    }
}