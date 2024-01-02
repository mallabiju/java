package ZB_Swing;

import java.awt.*;
import javax.swing.*;

public class c_jtextfield extends JFrame {
    c_jtextfield() {
        JTextField jtf = new JTextField(20); // creating JTextField.
        add(jtf); // adding JTextField to frame.
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new c_jtextfield();
    }
}
