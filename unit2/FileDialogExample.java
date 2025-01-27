import java.awt.*;


public class FileDialogExample extends Frame {
    public FileDialogExample() {
        setTitle("Simple File Dialog Example");
        setSize(400, 300);

        FileDialog fileDialog = new FileDialog(this, "Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);

      
    }

    public static void main(String[] args) {
        new FileDialogExample();
    }
}
