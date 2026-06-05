import java.io.FileWriter;

class p6
{
    public static void main(String args[])
    {
        try
        {
            FileWriter f = new FileWriter("C:\\Users\\AARYA\\Desktop\\Aarya_java\\chp3\\file handling\\text2.txt");
            String s = "my name is aaarya ketan dharme";
            f.write(s);
            f.close();
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        System.out.println("sucess");
    }
}