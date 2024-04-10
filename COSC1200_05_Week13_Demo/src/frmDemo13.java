import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmDemo13 {
    private JComboBox cboColours;
    private JTextField txtAddColour1;
    private JRadioButton radOption1;
    private JRadioButton radOption2;
    private JRadioButton radOption3;
    private JRadioButton radOption4;
    private JButton btnAddColour;
    private JCheckBox chkActive;
    private JButton btnNewWindow;
    private JLabel lblColours;
    private JLabel lblAddColour;
    private JLabel lblMC;
    private JLabel lblActive;
    private JPanel panelMain;

    private String colourChoice = "";

    public frmDemo13() {

        cboColours.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(cboColours, "You Selected: " + cboColours.getSelectedItem());
            }
        });

        cboColours.addItem("Green");
        cboColours.addItem("Purple");
        cboColours.addItem("Orange");


        btnNewWindow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new frmTryMe();
            }
        });
        btnAddColour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtAddColour1.getText().trim().length() > 0) { cboColours.addItem(txtAddColour1.getText()); }
            }
        });

        //<editor-fold desc="">
        radOption1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseRadio("One");
            }
        });
        radOption2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseRadio("Two");
            }
        });
        radOption3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseRadio("Three");
            }
        });
        radOption4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseRadio("Four");
            }
        });


        //</editor-fold>

    }  // end of constructor

    private void chooseRadio (String inputString) {
        colourChoice = inputString;
        JOptionPane.showMessageDialog(lblMC, "You selected " + colourChoice);

        if (chkActive.isSelected()) {}
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("frmDemo13");
        frame.setContentPane(new frmDemo13().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

}
