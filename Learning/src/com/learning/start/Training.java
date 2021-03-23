package com.learning.start;

import javax.swing.*;
//import com.learning.start.OK;

public class Training extends JFrame {
    private JPanel Training;
    private JButton Submit;
    private JTextField nameSubmit;
    private JTextField ageSubmit;
    private JTextArea submitted;


    public  Training(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Training);
        this.pack();

        Submit.addActionListener(actionEvent -> {
                String sub = (String)(String.format(nameSubmit.getText()));
                String sub2 = (String)(String.format(ageSubmit.getText()));

                submitted.setText("Name: " + sub + " \n" + "Age: " + sub2);

        });

    }
}
