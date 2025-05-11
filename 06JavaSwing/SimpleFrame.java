package JavaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;

public class SimpleFrame {
    SimpleFrame() {
        JFrame frame = new JFrame("Java Swing Application");
        frame.setSize(100, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JButton left = new JButton("Left");
        JButton right = new JButton("Right");
        JLabel lb1 = new JLabel("Click a button");
        frame.add(left);
        frame.add(right);
        frame.add(lb1);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleFrame();
            }
        });
    }
}
