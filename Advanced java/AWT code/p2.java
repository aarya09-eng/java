import java.awt.*;

class p2 extends Frame
{
    p2()
    {
        Frame f = new Frame();
        Button b = new Button("Click me");
        b.setBounds(30,50,80,30);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[])
    {
        p2 p = new p2(); 
    }
}