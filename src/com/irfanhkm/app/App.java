package com.irfanhkm.app;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App {
    private JButton button1;
    private JTextField asTextField;
    public JPanel mainPanel;

    public App() {
        buttonInputListener();
    }

    /**
     * Handle button input listener, when submit button clicked
     */
    private void buttonInputListener() {
        button1.addActionListener(e -> {
                String input = asTextField.getText();
                if (validateText(input)) {
                    showMessage("Nama Valid");
                } else {
                    showMessage("Nama Minimal 6 Karakter");
                }
            }
        );
    }

    /**
     * show dialog message.
     * @param message String
     */
    private void showMessage(String message) {
        JOptionPane.showMessageDialog(
            null,
            message
        );
    }

    /**
     * simple text length validation.
     * @param text String
     * @return boolean
     */
    private boolean validateText(String text) {
        return text.length() >= 6;
    }
}
