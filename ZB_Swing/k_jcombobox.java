package ZB_Swing;

import java.awt.*;
import javax.swing.*;

public class k_jcombobox extends JFrame {
    String name[] = { "Select a name", "Ram", "Sita", "Hari", "Gita" }; // list of name.

    public k_jcombobox() {
        // JComboBox jc = new JComboBox(name);	// JComboBox is a raw type. References to generic type JComboBox<E> should be parameterized, JComboBox is now a generic class.
        JComboBox<String> jc = new JComboBox<>(name); // initialzing combo box with list of name.
        add(jc); // adding JComboBox to frame.
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new k_jcombobox();
    }
}
