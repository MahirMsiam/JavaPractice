import javax.swing.*;
import java.awt.event.*;

public class Dashboard implements ActionListener {

    JButton insertBtn;
    JLabel lano;
    JLabel lbalance;
    JTextField uname;
    JPasswordField upass;
    JButton deleteBtn;
    JButton dispBtn;
    JTextArea display;
    JButton searchBtn;
    JButton logoutBtn;
    JFrame frame;

    Dashboard() {
        // create frame
        frame = new JFrame("Dashboard");

        // construct components
        insertBtn = new JButton("Insert");
        lano = new JLabel("Account Number");
        lbalance = new JLabel("Balance");
        uname = new JTextField(5);
        upass = new JPasswordField(5);
        deleteBtn = new JButton("Delete");
        dispBtn = new JButton("Display");
        display = new JTextArea(5, 5);
        searchBtn = new JButton("Search");
        logoutBtn = new JButton("Logout");

        // add components
        frame.add(insertBtn);
        frame.add(lano);
        frame.add(lbalance);
        frame.add(uname);
        frame.add(upass);
        frame.add(deleteBtn);
        frame.add(dispBtn);
        frame.add(display);
        frame.add(searchBtn);
        frame.add(logoutBtn);

        // set component bounds (only needed by Absolute Positioning)
        insertBtn.setBounds(35, 30, 120, 30);
        lano.setBounds(35, 90, 100, 25);
        lbalance.setBounds(35, 130, 100, 25);
        uname.setBounds(155, 90, 100, 25);
        upass.setBounds(155, 130, 100, 25);
        deleteBtn.setBounds(165, 30, 120, 30);
        dispBtn.setBounds(290, 30, 120, 30);
        display.setBounds(35, 180, 380, 90);
        searchBtn.setBounds(420, 30, 120, 30);
        logoutBtn.setBounds(525, 5, 75, 20);

        // addActionListener
        logoutBtn.addActionListener(this);

        // frame properties
        // adjust size and set layout
        frame.setSize(624, 329);
        frame.setLocationRelativeTo(null);// to center screen gui
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == logoutBtn) {
            new Login();
            frame.setVisible(false);
            // System.exit(0);

        }
    }

}