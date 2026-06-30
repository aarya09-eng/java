import java.awt.*;

class p8 extends Frame
{
    p8()
    {
        p8 p = new p8();
        p.setBounds(30,30,130,130);
        add(p);
        setSize(400,400);
        setLayout(null);
        setVisible(true); 
    }
    
    public static void main(String args[])
    {
        new p8();
    }
}