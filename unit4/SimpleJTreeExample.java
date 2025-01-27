import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class SimpleJTreeExample {
    public static void main(String[] args) {
        // Create the root node and add child nodes
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("File");
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Images");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Video");
        DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("MY File");
        root.add(node1);
        root.add(node2);
        root.add(node3);

        // Create the tree with the root node
        JTree tree = new JTree(root);

        // Create a scroll pane and add the tree to it
        JScrollPane scrollPane = new JScrollPane(tree);

        // Create a JFrame to hold the tree
        JFrame frame = new JFrame("Simple JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

