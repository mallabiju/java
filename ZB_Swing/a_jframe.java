package ZB_Swing;

import javax.swing.*;

public class a_jframe extends JFrame {
    a_jframe() {
        setSize(400, 400); // setting the size of the JFrame
        setVisible(true); // setting visibility
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setting close operation
    }

    public static void main(String[] args) {
        new a_jframe();
    }
}
