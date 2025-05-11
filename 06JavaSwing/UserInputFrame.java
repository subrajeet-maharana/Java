import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class UserInputFrame {

    UserInputFrame() {
        JFrame frame = new JFrame("Java Swing Application");
        frame.setSize(800, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,2,5,10));
        JTextField username = new JTextField();
        Label userLabel = new Label("username");
        JTextField password = new JTextField();
        Label passLabel = new Label("password");
        JButton reset = new JButton("Reset");
        JButton login = new JButton("Login");
        frame.add(userLabel);
        frame.add(username);
        frame.add(passLabel);
        frame.add(password);
        frame.add(reset);
        frame.add(login);
        frame.setVisible(true);
        
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                username.setText(null);
                password.setText(null);
            }
        });
        
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println(username.getText());
                System.out.println(password.getText());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new UserInputFrame();
            }
        });
    }
}
