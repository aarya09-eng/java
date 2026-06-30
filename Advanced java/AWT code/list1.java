import java.awt.*;

class list1 extends Frame
{
    list1()
    {
        List langlist = new List(5,false);
        langlist.setBounds(100,60,200,90);
        langlist.add("C programming");
        langlist.add("Java");
        langlist.add("Python");
        langlist.add("C++");
        add(langlist);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        list1 l1 = new list1();
    }
}