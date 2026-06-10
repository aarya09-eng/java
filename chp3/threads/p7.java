class p7
{
    public static void main(String args[])
    {
        System.out.println("Hello world!");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Aarya");
        System.out.println("The new thread name = "+Thread.currentThread().getName());
    }
}