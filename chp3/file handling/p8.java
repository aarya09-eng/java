import java.io.*;

class p8
{
    public static void main(String args[])
    {
        try
        {
            Writer f = new FileWriter("C:\\Users\\AARYA\\Desktop\\Aarya_java\\chp3\\file handling\\text4.txt");
            String content = "i am witing one of the file handling code";
            f.write(content);
            f.close();
            System.out.println("Sucess..");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}