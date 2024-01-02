package ZB_Swing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class zd_jtree {
    JFrame tree_f;

    zd_jtree() {
        tree_f = new JFrame();
        DefaultMutableTreeNode tree_style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode tree_color = new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode tree_font = new DefaultMutableTreeNode("font");
        tree_style.add(tree_color);
        tree_style.add(tree_font);
        DefaultMutableTreeNode tree_red = new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode tree_blue = new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode tree_black = new DefaultMutableTreeNode("black");
        DefaultMutableTreeNode tree_green = new DefaultMutableTreeNode("green");
        tree_color.add(tree_red);
        tree_color.add(tree_blue);
        tree_color.add(tree_black);
        tree_color.add(tree_green);
        JTree tree_jt = new JTree(tree_style);
        tree_f.add(tree_jt);
        tree_f.setSize(200, 200);
        tree_f.setVisible(true);
    }

    public static void main(String[] args) {
        new zd_jtree();
    }
}
