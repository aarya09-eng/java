import java.awt.*;

class p3
{
    p3()
    {
        Frame f = new Frame();
        Button b = new Button("Click me!");

        b.setBounds(30,50,80,30);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[])
    {
        p3 p = new p3();
    }
}