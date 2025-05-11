package JavaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventListener {

    EventListener() {
        JFrame frame = new JFrame("Java Swing Application");
        frame.setSize(120, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JButton left = new JButton("Left");
        JButton right = new JButton("Right");
        JLabel lb1 = new JLabel("Click a button");
        frame.add(left);
        frame.add(right);
        frame.add(lb1);
        frame.setVisible(true);

        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lb1.setText("Left Button Pressed");
            }
        });

        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lb1.setText("Right Button Pressed");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EventListener();
            }
        });
    }
}
