import java.awt.*;
import java.awt.event.*;

public class mousemotionadapter extends MouseMotionAdapter
{
    Frame f;

    mousemotionadapter()
    {
        f = new Frame("Mouse Adapter");
        f.addMouseMotionListener(this);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void mouseDragged(MouseEvent e)
    {
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 30, 30);
    }

    public static void main(String args[])
    {
        new mousemotionadapter();
    }
}