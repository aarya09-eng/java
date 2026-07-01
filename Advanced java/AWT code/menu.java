import java.awt.*;

public class Menu extends Frame
{
    Menu()
    {
        MenuBar menubar = new MenuBar();

        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");

        MenuItem itemNew = new MenuItem("New");
        MenuItem itemOpen = new MenuItem("Open");
        MenuItem itemExit = new MenuItem("Exit");

        fileMenu.add(itemNew);
        fileMenu.add(itemOpen);
        fileMenu.addSeparator();
        fileMenu.add(itemExit);

        Menu formatSubMenu = new Menu("Format");
        MenuItem itemFont = new MenuItem("Font...");
        MenuItem itemColor = new MenuItem("Color...");

        formatSubMenu.add(itemFont);
        formatSubMenu.add(itemColor);

        MenuItem itemCopy = new MenuItem("Copy");

        editMenu.add(itemCopy);
        editMenu.add(formatSubMenu);

        menubar.add(fileMenu);
        menubar.add(editMenu);

        setMenuBar(menubar);

        setTitle("Menu Example");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[])
    {
        new Menu();
    }
}