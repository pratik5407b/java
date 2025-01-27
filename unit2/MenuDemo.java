import java.awt.*;

public class MenuDemo extends Frame {
    public MenuDemo() {
        this.setTitle("Menu");
        this.setSize(600, 600);
        this.setLayout(null);
        this.setVisible(true);

        MenuBar mb = new MenuBar();
        Menu filemenu = new Menu("file");

       

        MenuItem i1 = new MenuItem("New             ctrl+N");
        Menu i2 = new Menu("Actions");
        MenuItem m= new MenuItem("cut");

        MenuItem m1= new MenuItem("copy");
        MenuItem m2= new MenuItem("paste");         
        i2.add(m);
        i2.add(m1);
        i2.add(m2);


        MenuItem i3 = new MenuItem("New Window       ctrl+shift+N");
        MenuItem i4 = new MenuItem("Open             ctrl+O");
        MenuItem i9 = new MenuItem("Save             ctrl+S");
        MenuItem i10 = new MenuItem("Save as             ctrl+shift+S");

        filemenu.add(i1);
        filemenu.add(i2);
        filemenu.add(i3);
        filemenu.add(i4);


       filemenu.add(i9);
       filemenu.add(i10);

        Menu editmenu = new Menu("Edit");

        MenuItem i5 = new MenuItem("Item 1");
        MenuItem i6 = new MenuItem("Item 2");
        MenuItem i7 = new MenuItem("Item 3");
        MenuItem i8 = new MenuItem("Item 4");
        
        editmenu.add(i5);
        editmenu.add(i6);
        editmenu.add(i7);
        editmenu.add(i8);

        mb.add(filemenu);
        mb.add(editmenu);
        this.setMenuBar(mb); // Set the menu bar for the frame
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}
