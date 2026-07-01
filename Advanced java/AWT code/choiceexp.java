import java.awt.*;

class choiceexp extends Frame
{
    choiceexp()
    {
        Choice c1 = new Choice();
        c1.setBounds(30,30,130,130);
        c1.add("C");
        c1.add("java");
        c1.add("python");
        c1.add("C++");
        c1.add("HTML");

        add(c1);

        setSize(400,400);
        setLayout(null);
        setVisible(true);
        
    }

    public static void main(String args[])
    {
        new choiceexp();

    }
}