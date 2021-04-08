package Views;

import javax.swing.*;
import java.awt.*;

public class CatView extends JFrame {
    private JPanel rootPanel;
    private JPanel catButtons;
    private JPanel catDescription;

    public CatView() {
       rootPanel = new JPanel();

       rootPanel.setLayout(new GridLayout(2,1));
       rootPanel.setSize(1000 ,1000);

       this.catButtons = new JPanel(new GridLayout(15,5));
       this.catButtons.setSize(1000,300);
       this.catButtons.setBackground(Color.darkGray);

        this.catDescription = new JPanel(new GridLayout(1,1));
        this.catDescription.setSize(1000,700);
        this.catDescription.setBackground(Color.gray);

        this.rootPanel.add(catButtons);
        this.rootPanel.add(catDescription);

        this.add(rootPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000 ,1000);
        this.setVisible(true);
    }

    public JPanel getCatDescriptionPanel() {return catDescription;}

    public JPanel getCatButtonPanel() {
        return catButtons;
    }
}

