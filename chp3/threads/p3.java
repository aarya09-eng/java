/**
 * The class `p3` extends `Thread` and when run, it prints "Hello world!" and the `main` method creates
 * two instances of `p3` and starts them as separate threads.
 */
class p3 extends Thread
{
    public void run()
    {
        System.out.println("Hello world!");
    }

    public static void main(String args[])
    {
        p3 p = new p3();
        p.start();

        p3 p1 = new p3();
        p1.start();
    }
}