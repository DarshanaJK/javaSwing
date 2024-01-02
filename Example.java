import javax.swing.*;
import java.awt.*;
class Notepad extends JFrame{

    TextArea textArea;

    JMenuBar mainMenuBar;

    JMenu fileMenu;
    JMenu editMenu;
    JMenu viewMenu;

    JMenuItem item1;
    JMenuItem item2;
    JMenuItem item3;
    JMenuItem item4;
    JMenuItem item5;
    JMenuItem item6;


    Notepad(){
        setSize(600, 500);
        setTitle("Untitled");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainMenuBar = new JMenuBar();



        fileMenu = new JMenu("File");
        item1 = new JMenuItem("Menu Item 1");
        item2 = new JMenuItem("Menu Item 2");
        fileMenu.add(item1);
        fileMenu.add(item2);
        mainMenuBar.add(fileMenu);

        editMenu = new JMenu("Edit");
        item3 = new JMenuItem("Menu Item 3");
        item4 = new JMenuItem("Menu Item 4");
        editMenu.add(item3);
        editMenu.add(item4);
        mainMenuBar.add(editMenu);

        viewMenu = new JMenu("View");
        item5 = new JMenuItem("Menu Item 5");
        item6 = new JMenuItem("Menu Item 6");
        viewMenu.add(item5);
        viewMenu.add(item6);
        mainMenuBar.add(viewMenu);



        setJMenuBar(mainMenuBar);


        textArea = new TextArea();
        textArea.setFont(new Font("", Font.BOLD, 16));

        add("Center", textArea);


        JScrollPane scrollPane = new JScrollPane(textArea);
        add("Center",scrollPane);

        setVisible(true);
    }



}

class Example{
    public static void main(String[] args) {
        new Notepad();
    }
}