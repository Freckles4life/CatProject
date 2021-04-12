package Views;

import javax.swing.*;
import java.awt.*;

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
    private JLabel catBreedImage;

    public CatDescription(String catName, String catDescription, String wikiUrl, String imageUrl, String catTemperment, Image catImage) {

        this.catName.setText("Name");
        this.catNameText.setText(catName);

        this.catDescription.setText("Description");
        this.catDescriptionText.setText(catDescription);
        this.catDescriptionText.setLineWrap(true);

        this.catTemperment.setText("Temperment");
        this.catTempermentText.setText(catTemperment);
        this.catTempermentText.setLineWrap(true);

        this.imageUrl.setText("Image Url");
        this.imageUrlText.setText(imageUrl);

        this.wikiUrl.setText("Wiki Url");
        this.wikiUrlText.setText(wikiUrl);

        if(catImage != null)
        {
            this.catBreedImage.setIcon(new ImageIcon(catImage));
        }
        else
        {
            this.catBreedImage.setText("No cat image! (= ＴェＴ=)");
        }
        this.add(catDescriptionPanel);

    }

}
