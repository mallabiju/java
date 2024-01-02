package ZB_Swing;

import javax.swing.*;

public class x_joptionpane {
    JFrame optionPane_f;

    x_joptionpane() {
        optionPane_f = new JFrame();
        JOptionPane.showInputDialog(optionPane_f, "Enter your Name");
    }

    public static void main(String[] args) {
        new x_joptionpane();
    }
}
