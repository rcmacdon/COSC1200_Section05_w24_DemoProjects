/* **********************************
File:
Author:     Clint MacDonald
Date:
Purpose:
************************************* */
import javax.swing.*;
import java.awt.*;

public class frmTryMe {

    private JComboBox cboCars;

    public frmTryMe(){
        createFormElements();
    }

    private void createFormElements() {
        JFrame frame = new JFrame();

        // Panel
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        panel.setLayout(new GridLayout(0,1));

        String[] cars = new String[] {"Civic", "Corolla", "F-150", "Forrester", "CRV", "Elantra"};
        // instantiate combobox
        cboCars = new JComboBox();
        // populate the combobox
        for (String car: cars) {
            cboCars.addItem(car);
        }

        panel.add(cboCars);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("New Form opened afterwards");
        frame.pack();
        frame.setVisible(true);

    }


}
