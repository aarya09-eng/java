import java.awt.*;

class p1 extends Frame
{
    p1()
    {
        Button b = new Button("Click me!");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[])
    {
        p1 p = new p1();
    }
}