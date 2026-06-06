import java.io.*;

class p7
{
    public static void main(String args[])
    {
        try
        {
            FileReader f = new FileReader("C:\\Users\\AARYA\\Desktop\\Aarya_java\\chp3\\file handling\\text4.txt");
            int data = f.read();
            while(data != -1)
            {
                System.out.print((char)data);
                data = f.read();
            }
            f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}