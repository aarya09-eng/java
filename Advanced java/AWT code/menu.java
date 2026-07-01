import java.awt.*;

class menu extends Frame
{
    menu()
    {
        MenuBar menubar = new MenuBar();

        Menu FileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");

        MenuItem ItemNew = new MenuItem("New");
        MenuItem ItemOpen = new MenuItem("Open");
        MenuItem ItemExit = new MenuItem("Exit");
        
        FileMenu.add(ItemNew);
        FileMenu.add(ItemOpen);
        FileMenu.add(ItemExit);

        FileMenu.addSepererator();
        FileMenu.add(ItemExit);

        Menu formatSubMenu = new Menu("Format");
        MenuItem ItemFont = new MenuItem("Font..");
        MenuItem ItemColor = new MenuItem("Color..");

        formatSubMenu.add(itemFont);
        formatSubMenu.add(itemColor);

        MenuItem itemCopy = new MenuItem("Copy");
        editMenu.add(itemCopy);
        editMenu.add(formalSubMenu);

        menBar.add(FileMenu);
        menuar.add(editMenu);

        setMenuBar(menuBar);

        setSize(400,400);
        setLayout(null);
        setVisible(true);


    }

    public static void main(String args[])
    {
        new Menu();
    }
}