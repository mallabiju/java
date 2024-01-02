package ZB_Swing;

import javax.swing.*;

public class z_jmenubar_jmenu_jmenuitem {
    JMenu m_menu, m_submenu;
    JMenuItem menu_i1, menu_i2, menu_i3, menu_i4, menu_i5;

    z_jmenubar_jmenu_jmenuitem() {
        JFrame menu_f = new JFrame("Menu and MenuItem Example");
        JMenuBar menu_mb = new JMenuBar();
        m_menu = new JMenu("Menu");
        m_submenu = new JMenu("Services");
        menu_i1 = new JMenuItem("Home");
        menu_i2 = new JMenuItem("About Us");
        menu_i3 = new JMenuItem("Gallery");
        menu_i4 = new JMenuItem("Trainings");
        menu_i5 = new JMenuItem("Research Guidings");
        m_menu.add(menu_i1);
        m_menu.add(menu_i2);
        m_menu.add(menu_i3);
        m_submenu.add(menu_i4);
        m_submenu.add(menu_i5);
        m_menu.add(m_submenu);
        menu_mb.add(m_menu);
        menu_f.setJMenuBar(menu_mb);
        menu_f.setSize(500, 500);
        menu_f.setLayout(null);
        menu_f.setVisible(true);
    }

    public static void main(String args[]) {
        new z_jmenubar_jmenu_jmenuitem();
    }
}
