import java.awt.*;
import java.awt.Graphics;
import java.applet.*;

//<applet code="p3.java" width =300 height=300></applet>

public class p3 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(10,10,60,50);
		g.fillRect(100,10,60,50);
		g.drawRoundRect(190,10,60,50,15,15);
		g.fillRoundRect(70,90,140,100,30,40);
	}
}