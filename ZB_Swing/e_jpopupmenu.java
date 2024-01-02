package ZB_Swing;

import javax.swing.*;
import java.awt.event.*;

class e_jpopupmenu {
    e_jpopupmenu() {
        final JFrame pop_upf = new JFrame("Popup Menu Demo");
        final JPopupMenu popupmenu1 = new JPopupMenu("Edit");
        JMenuItem pop_upcut = new JMenuItem("Cut");
        JMenuItem pop_upcopy = new JMenuItem("Copy");
        JMenuItem pop_uppaste = new JMenuItem("Paste");
        popupmenu1.add(pop_upcut);
        popupmenu1.add(pop_upcopy);
        popupmenu1.add(pop_uppaste);
        pop_upf.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent a) {
                popupmenu1.show(pop_upf, a.getX(), a.getY());
            }
        });
        pop_upf.add(popupmenu1);
        pop_upf.setSize(300, 300);
        pop_upf.setLayout(null);
        pop_upf.setVisible(true);
    }

    public static void main(String args[]) {
        new e_jpopupmenu();
    }
}

// to see the effect right click on output screen.
