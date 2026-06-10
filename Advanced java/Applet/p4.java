import java.awt.*;
import java.awt.Graphics;
import java.applet.*;

//<applet code="p4.java" width =900 height=900></applet>

public class p4 extends Applet
{
	public void paint(Graphics g)
	{
		g.fillOval(10,10,75,50);
		g.drawOval(190,10,90,30);
		g.fillOval(70,90,140,100);
	}
}