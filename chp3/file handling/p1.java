import java.io.FileInputStream;

public class p1
{
    public static void main(String args[])
    {   
        try
        {
            FileInputStream fin = new FileInputStream("C:\\Users\\AARYA\\Desktop\\Aarya_java\\chp3\\file handling\\text1.txt");
            int i = fin.read();
            System.out.println((char)i);
            fin.close();
        }
    
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
