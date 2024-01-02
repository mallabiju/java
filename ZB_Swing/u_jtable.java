package ZB_Swing;

import javax.swing.*;

public class u_jtable {
    JFrame table_f;

    u_jtable() {
        table_f = new JFrame();
        String table_data[][] = {
             { "11", "Ram" },
             { "13", "Sita" },
             { "16", "Laxman" }
        };
        String table_column[] = { "Roll No", "Student Name" };
        JTable table_jt = new JTable(table_data, table_column);
        table_jt.setBounds(30, 40, 200, 300);
        JScrollPane table_sp = new JScrollPane(table_jt);
        table_f.add(table_sp);
        table_f.setSize(300, 400);
        table_f.setVisible(true);
    }

    public static void main(String[] args) {
        new u_jtable();
    }
}
