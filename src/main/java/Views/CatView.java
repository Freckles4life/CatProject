package Views;
import javax.swing.*;
import java.awt.*;

public class CatView extends JFrame {
    private JPanel rootPanel;
    private JPanel catButtons;
    private JPanel catDescription;
    private JLabel titleLabel;

    public CatView() {

        this.titleLabel.setText("❤ Choose your kitten breed ❤");
        this.titleLabel.setFont(new Font("Magneto", Font.PLAIN, 30));

        this.catButtons.setLayout(new GridLayout(15, 5));

        this.add(rootPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 850);
        this.setVisible(true);
    }

    public JPanel getCatDescriptionPanel() {
        return catDescription;
    }

    public JPanel getCatButtonPanel() {
        return catButtons;
    }

    }





