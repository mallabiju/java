package ZB_Swing;

import javax.swing.*;

public class r_internalframe extends JFrame {

    static JFrame f;
    static JLabel l;

    public static void main(String[] args) throws Exception {
        f = new JFrame();
        JInternalFrame in = new JInternalFrame();
        in.setTitle("InternalFrame");
        JButton b = new JButton("button");
        l = new JLabel("This is a JInternal Frame ");
        JPanel p = new JPanel();
        p.add(l);
        p.add(b);
        in.setVisible(true);
        in.add(p);
        f.add(in);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
