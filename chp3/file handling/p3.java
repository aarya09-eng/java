import java.io.FileOutputStream;

public class p3
{
    public static void main(String args[])
    {   
        try
        {
            FileOutputStream fin = new FileOutputStream("C:\\Users\\AARYA\\Desktop\\Aarya_java\\chp3\\file handling\\text3.txt");
            fin.write(66);
            fin.close();
            System.out.println("Sucess....");
        }
    
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
