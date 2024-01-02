package ZB_Swing;

import javax.swing.*;

public class j_jlist {
    j_jlist() {
        JFrame list_f = new JFrame();
        DefaultListModel<String> list_l1 = new DefaultListModel<>();
        list_l1.addElement("Red");
        list_l1.addElement("Pink");
        list_l1.addElement("Blue");
        list_l1.addElement("Black");
        JList<String> list1 = new JList<>(list_l1);
        list1.setBounds(100, 100, 75, 75);
        list_f.add(list1);
        list_f.setSize(400, 400);
        list_f.setLayout(null);
        list_f.setVisible(true);

    }

    public static void main(String[] args) {
        new j_jlist();
    }
}
