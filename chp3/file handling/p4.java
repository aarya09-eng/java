import java.io.FileOutputStream;

public class p4
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream f = new FileOutputStream("C:\\Users\\AARYA\\Desktop\\Aarya_java\\chp3\\file handling\\text2.txt");
            String s = "hi! my name is aarya and this is my another program of file handling";
            byte b[] = s.getBytes();
            f.write(b);
            f.close();
            System.out.println("Sucess");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}