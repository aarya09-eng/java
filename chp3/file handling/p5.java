import java.io.FileReader;
class p5
{
public static void main(String args[])throws Exception 
{
    FileReader r = new FileReader("C:\\Users\\AARYA\\Desktop\\Aarya_java\\chp3\\file handling\\text2.txt");
    int i = 0;
    while((i=r.read())!=-1)
    System.out.print((char)i);
    r.close();
}
}