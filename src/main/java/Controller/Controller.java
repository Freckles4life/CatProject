package Controller;

import ApiClients.CatApiClient;
import Models.CatModel;
import Models.CatViewModel;
import Views.CatDescription;
import Views.CatView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;


public class Controller {

    private CatView theView;
    private CatViewModel theViewModel;
    private CatApiClient client;


    public Controller(CatView theView, CatViewModel theViewModel) {
        this.theView = theView;
        this.theViewModel = theViewModel;


        client = new CatApiClient();
        theViewModel.setBreedList(client.GetCatBreeds());

        this.AddBreedList();
    }

    private void AddBreedList() {
        for (CatModel cat : theViewModel.getBreedList()) {

            JButton catButton = new JButton(cat.getName());
            catButton.setBorderPainted(true);
            catButton.setFocusPainted(false);
            catButton.setContentAreaFilled(true);
            catButton.setBackground(new Color(152,64,99));
            catButton.setForeground(new Color(254, 150, 119));

            theView.getCatButtonPanel().add(catButton);

            catButton.addActionListener(e -> {

                var pressedButton = (JButton) e.getSource();
                String catBreedName = pressedButton.getText();
                CatModel catBreed =
                        Arrays.stream(theViewModel.getBreedList())
                                .filter(cat1 -> catBreedName.equals(cat1.getName()))
                                .findFirst()
                                .get();

                CatDescription description = new CatDescription(
                        catBreed.getName(),
                        catBreed.getDescription(),
                        catBreed.getWikipedia_url(),
                        catBreed.getImage().getUrl(),
                        catBreed.getTemperament(),
                        this.GetCatImage((catBreed.getImage().getUrl()))
                );

                theView.getCatDescriptionPanel().removeAll();
                theView.getCatDescriptionPanel().add(description);

                //force theView to show new things.
                theView.invalidate();
                theView.validate();
                theView.repaint();
            });

            theView.invalidate();
            theView.validate();
            theView.repaint();
        }
    }

    private Image GetCatImage(String url){
        if(url == null) {
            return null;
        }

        Image catBreedImage = null;

        try{
            URL imageUrl = new URL(url);
            catBreedImage = ImageIO.read(imageUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(catBreedImage != null)
            catBreedImage = catBreedImage.getScaledInstance(200,200,Image.SCALE_DEFAULT);

        return catBreedImage;

    }
}