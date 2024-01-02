package ZB_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class za_jcheckboxmenuitem {
    public static void main(final String args[]) {
        JFrame checkbox_frame = new JFrame("Menu Check box Demo");
        checkbox_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar checkbox_menuBar = new JMenuBar();
        JMenu checkbox_fileMenu = new JMenu("File");
        checkbox_fileMenu.setMnemonic(KeyEvent.VK_F);
        checkbox_menuBar.add(checkbox_fileMenu);
        JMenuItem checkbox_menuItem1 = new JMenuItem("Open", KeyEvent.VK_N);
        checkbox_fileMenu.add(checkbox_menuItem1);

        JCheckBoxMenuItem checkbox_caseMenuItem = new JCheckBoxMenuItem("CheckBox Option");
        checkbox_caseMenuItem.setMnemonic(KeyEvent.VK_C);
        checkbox_fileMenu.add(checkbox_caseMenuItem);

        ActionListener checkbox_aListener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                AbstractButton checkbox_aButton = (AbstractButton) event.getSource();
                boolean checkbox_selected = checkbox_aButton.getModel().isSelected();
                String checkbox_newLabel;
                if (checkbox_selected) {
                    checkbox_newLabel = "Value-1";
                } else {
                    checkbox_newLabel = "Value-2";
                }
                checkbox_aButton.setText(checkbox_newLabel);
            }
        };

        checkbox_caseMenuItem.addActionListener(checkbox_aListener);
        checkbox_frame.setJMenuBar(checkbox_menuBar);
        checkbox_frame.setSize(350, 250);
        checkbox_frame.setVisible(true);
    }
}
