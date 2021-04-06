package Views;


import Controller.Controller;

import javax.swing.*;

public class CatView extends JFrame {
    private JButton button;
    private JPanel panel1;
    private JTextField textField;

    private Controller controller;

    public CatView() {

    }

    public JPanel getMainPanel() {
        return panel1;
    }
}

