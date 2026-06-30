import java.awt.*;

class p7 extends Frame
{
    p7()
    {
        Label l1 = new Label("Name");
        l1.setBounds(30, 30, 50, 20);

        TextField t1 = new TextField();
        t1.setBounds(90, 30, 100, 20);

        Button b1 = new Button("Save");
        b1.setBounds(90, 80, 60, 30);

        add(l1);
        add(t1);
        add(b1);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[])
    {
        new p7();
    }
}