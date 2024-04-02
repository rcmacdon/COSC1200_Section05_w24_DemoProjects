/* **********************************
File:
Author:     Clint MacDonald
Date:
Purpose:
************************************* */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class GUI_Form1 {

    //<editor-fold desc="Form Objects">
    private JFrame frame;
    private JLabel lblNum1, lblNum2, lblAnswer;
    private JTextField txtNum1, txtNum2;
    private JButton btnAdd, btnSub;
    //</editor-fold>

    //<editor-fold desc="Class Scope Variables">
    private enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public GUI_Form1() {
        createFormObjects();
    }
    //</editor-fold>

    private void createFormObjects() {
        frame = new JFrame();

        // panel / pane
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20,10,20,10));
        panel.setLayout(new GridLayout(0,1));

        //<editor-fold desc="Labels and TextBoxes">
        lblNum1 = new JLabel("First Number");
        lblNum2 = new JLabel("Second Number");
        txtNum1 = new JTextField();
        txtNum2 = new JTextField();

        // add any other properties using setters

        // add objects to the panel
        panel.add(lblNum1);
        panel.add(txtNum1);
        panel.add(lblNum2);
        panel.add(txtNum2);
        //</editor-fold>

        //<editor-fold desc="Buttons">
        btnAdd = new JButton("+");
        btnSub = new JButton("-");

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doOperation(Operation.ADD);
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doOperation(Operation.SUBTRACT);
            }
        });

        panel.add(btnAdd);
        panel.add(btnSub);
        //</editor-fold>

        lblAnswer = new JLabel();
        panel.add(lblAnswer);

        //<editor-fold desc="Frame Properties">
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Calculator");
        frame.pack();
        frame.setVisible(true);
        //</editor-fold>
    }

    private void doOperation(Operation op) {
        double num1 = 0, num2 = 0, answer = 0;

        if (Tools.isStringDouble(txtNum1.getText())) {
            num1 = Double.parseDouble(txtNum1.getText());
        }
        if (Tools.isStringDouble(txtNum2.getText())) {
            num2 = Double.parseDouble(txtNum2.getText());
        }

        switch (op) {
            case ADD:
                answer = num1 + num2;
                break;
            case SUBTRACT:
                answer = num1 - num2;
                break;
        }

        lblAnswer.setText(String.format("%.2f", answer));

    }

}
