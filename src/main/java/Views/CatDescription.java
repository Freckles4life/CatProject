package Views;

import javax.swing.*;

public class CatDescription extends JPanel{

    private JPanel catDescriptionPanel;
    private JLabel catName;
    private JTextField catNameText;
    private JLabel catDescription;
    private JTextArea catDescriptionText;
    private JLabel catTemperment;
    private JTextArea catTempermentText;
    private JLabel wikiUrl;
    private JTextField wikiUrlText;
    private JLabel imageUrl;
    private JTextField imageUrlText;

    public CatDescription(String catName, String catDescription, String wikiUrl, String imageUrl, String catTemperment) {

        this.catName.setText("Name");
        this.catNameText.setText(catName);

        this.catDescription.setText("Description");
        this.catDescriptionText.setText(catDescription);
        this.catDescriptionText.setLineWrap(true);

        this.catTemperment.setText("Termperment");
        this.catTempermentText.setText(catTemperment);
        this.catTempermentText.setLineWrap(true);

        this.imageUrl.setText("Image Url");
        this.imageUrlText.setText(imageUrl);

        this.wikiUrl.setText("Wiki Url");
        this.wikiUrlText.setText(wikiUrl);

        this.imageUrl.setText("Image Url");
        this.imageUrlText.setText(imageUrl);

        this.add(catDescriptionPanel);
    }

}
