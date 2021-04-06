package Views;

import Controller.Controller;
import Models.CatModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CatView {
    private JButton button;
    private JPanel panel1;
    private JTextField textField;

    private Controller controller;
    public CatView() {
      //  controller = new Controller("https://api.thecatapi.com/v1/breeds");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

              //  CatModel model = controller.getCatBreeds(textField.getText());
               // JOptionPane.showMessageDialog(panel1,model.getDescription().toString());

            }
        });
    }

    public JPanel getMainPanel() {
        return panel1;
    }
}

