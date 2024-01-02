package ZB_Swing;

import java.awt.*;
import javax.swing.*;

public class i_jradiobutton extends JFrame {
    i_jradiobutton() {
        JRadioButton jcb = new JRadioButton("Male"); // creating JRadioButton.
        add(jcb); // adding JRadioButton to frame.
        jcb = new JRadioButton("Female"); // creating JRadioButton.
        add(jcb); // adding JRadioButton to frame.
        jcb = new JRadioButton("Others"); // creating JRadioButton.
        add(jcb); // adding JRadioButton to frame.
        jcb = new JRadioButton("None");
        add(jcb);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new i_jradiobutton();
    }
}
