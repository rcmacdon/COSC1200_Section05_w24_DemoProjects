/* **********************************
File:
Author:     Clint MacDonald
Date:
Purpose:
************************************* */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class frmHello {

    private JLabel lblName;
    private JTextField txtName;
    private JButton btnHello;
    private JLabel lblChangeMe;
    private JButton btnChange;
    private JPanel panMain;

    public frmHello() {

        btnHello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnHello, "Hello " + txtName.getText());
            }
        });


        btnChange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblChangeMe.setText("Hello " + txtName.getText());
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Hello Program");
        frame.setContentPane(new frmHello().panMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
