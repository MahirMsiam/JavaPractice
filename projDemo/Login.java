import static javax.swing.JOptionPane.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener {

    private JButton lgnBtn;
    private JButton signBtn;
    private JButton exBtn;
    private JLabel lusn;
    private JLabel lpass;
    private JTextField uname;
    private JPasswordField upass;
    JFrame frame;

    Login() {

        // create frame
        frame = new JFrame("System");
        // construct components
        lgnBtn = new JButton("Login");
        signBtn = new JButton("Sign Up");
        exBtn = new JButton("Exit");
        lusn = new JLabel("Username");
        lpass = new JLabel("Password");
        uname = new JTextField();
        upass = new JPasswordField();

        // set component bounds (only needed by Absolute Positioning)
        lgnBtn.setBounds(150, 185, 100, 30);
        signBtn.setBounds(305, 185, 100, 30);
        exBtn.setBounds(205, 235, 140, 30);
        lusn.setBounds(150, 105, 100, 25);
        lpass.setBounds(150, 145, 100, 25);
        uname.setBounds(305, 105, 100, 25);
        upass.setBounds(305, 145, 100, 25);

        // addActionListener
        lgnBtn.addActionListener(this);

        // add components
        frame.add(lgnBtn);
        frame.add(signBtn);
        frame.add(exBtn);
        frame.add(lusn);
        frame.add(lpass);
        frame.add(uname);
        frame.add(upass);

        // frame properties
        // adjust size and set layout
        frame.setSize(624, 400);
        frame.setLocationRelativeTo(null);// to center screen gui
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == lgnBtn) {
            String user = uname.getText();
            String pass = upass.getText();

            if (user.equals("siam") && pass.equals("1234")) {

                new Dashboard();
                frame.setVisible(false);

            }

            else {
                showMessageDialog(null, "Invalid Username or password!");
            }

        }
    }
}