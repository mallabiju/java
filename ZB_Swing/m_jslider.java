package ZB_Swing;

import javax.swing.*;

public class m_jslider extends JFrame {
    m_jslider() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }

    public static void main(String[] args) {
        m_jslider frame = new m_jslider();
        frame.pack();
        frame.setVisible(true);
    }
}
