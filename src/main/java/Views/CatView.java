package Views;
import javax.swing.*;
import java.awt.*;

public class CatView extends JFrame {
    private JPanel rootPanel;
    private JPanel catButtons;
    private JPanel catDescription;
    private JLabel label;
    private JLabel label1;
   // JScrollPane scrollPane = new JScrollPane();

    public CatView() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridLayout(4, 1));
        //ScrollPane sp = new ScrollPane();
        //sp.setSize(1250, 700);
        //sp.setVisible(true);

        this.label1 = new JLabel("Choose your little furry warrior!");
        this.label1.setFont(new Font("Magneto", Font.PLAIN, 30));
        this.label1.setHorizontalAlignment(JLabel.CENTER);
        this.label1.setForeground(new Color(122, 1, 1));

        this.label = new JLabel(new ImageIcon("Kitten.png"));

        this.catButtons = new JPanel(new GridLayout(15, 5));
        this.catButtons.setBackground(Color.darkGray);

        this.catDescription = new JPanel(new GridLayout(1, 1));
        this.catDescription.setBackground(Color.gray);

        this.rootPanel.add(label);
        this.rootPanel.add(label1);
        this.rootPanel.add(catButtons);
        this.rootPanel.add(catDescription);
        //this.rootPanel.add(scrollPane);

        this.add(rootPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1250, 1000); // visa vizualizācijas loga lielums//
        this.setVisible(true);
    }

    public JPanel getCatDescriptionPanel() {
        return catDescription;
    }

    public JPanel getCatButtonPanel() {
        return catButtons;
    }

    }





