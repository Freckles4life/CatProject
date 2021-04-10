package Controller;

import ApiClients.CatApiClient;
import Models.CatModel;
import Models.CatViewModel;
import Views.CatDescription;
import Views.CatView;

import javax.swing.*;
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
                        catBreed.getTemperament()
                );

                theView.getCatDescriptionPanel().removeAll();
                theView.getCatDescriptionPanel().add(description);

                //force theView to show new things.
                theView.invalidate();
                theView.validate();
                theView.repaint();
            });

            //force theView to show new things.
            theView.invalidate();
            theView.validate();
            theView.repaint();
        }
    }
}