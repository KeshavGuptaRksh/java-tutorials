import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * FrameTutorial
 */
public class FrameTutorial {

    FrameTutorial() {
        JFrame frame = new JFrame("My Frame");
        JLabel label = new JLabel("Username");
        frame.setSize(700, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocation(500, 100);
        // frame.setTitle("My Frame");
        // Container c = frame.getContentPane();
        // c.setBackground(Color.GRAY);
        // frame.setResizable(false);
        frame.setLayout(null);
        label.setBounds(20, 20, 200, 30);
        Font font = new Font("Arial", Font.ITALIC, 20);
        Font buttonFont = new Font("Arial", Font.BOLD, 20);
        label.setFont(font);
        frame.add(label);
        JButton button = new JButton("Demo");
        button.setBounds(20, 70, 100, 50);

        button.setBackground(Color.red);
        // button.setBorderPainted(true);
        button.setForeground(Color.green);
        button.setFont(buttonFont);
        frame.add(button);
    }
}