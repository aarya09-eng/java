import java.awt.*;
import java.awt.event.*;

class p6 extends Frame
{
    TextField tf;

    p6()
    {
        tf = new TextField();
        tf.setBounds(60,50,170,20); 
        Button b = new Button("Click Me!");
        b.setBounds(100,120,80,30);

    }
}