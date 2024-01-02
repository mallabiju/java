package ZB_Swing;

import javax.swing.*;
import java.awt.*;

public class l_imageicon {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("ImageIcon Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Load an image using ImageIcon
        ImageIcon icon = new ImageIcon("D:/SCJAVA/ZB_Swing/zz_myicon.png"); // your image file path

        // Create a JLabel with the loaded ImageIcon
        JLabel label = new JLabel(icon);
        
        // Add the JLabel to the JFrame's content pane
        frame.getContentPane().add(label, BorderLayout.CENTER);

        // Display the JFrame
        frame.setVisible(true);
    }
}

