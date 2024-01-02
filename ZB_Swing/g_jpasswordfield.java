package ZB_Swing;

import javax.swing.*;

public class g_jpasswordfield {
    public static void main(String[] args) {
        JFrame passWord_f = new JFrame("Passwork Picker");
        JPasswordField passWord_value = new JPasswordField();
        JLabel passWord_l1 = new JLabel("Password ");
        passWord_l1.setBounds(20, 100, 100, 30);
        passWord_value.setBounds(100, 100, 100, 30);
        passWord_f.add(passWord_value);
        passWord_f.add(passWord_l1);
        passWord_f.setSize(300, 300);
        passWord_f.setLayout(null);
        passWord_f.setVisible(true);
    }
}
