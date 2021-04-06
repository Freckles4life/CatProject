package Controller;

import ApiClients.CatApiClient;
import Models.CatViewModel;
import Views.CatView;


public class Controller {

    private CatView theView;
    private CatViewModel theViewModel;
    private CatApiClient client;

    public Controller(CatView theView, CatViewModel theViewModel) {
        this.theView = theView;
        this.theViewModel = theViewModel;

        client = new CatApiClient();
        theViewModel.setBreedList(client.GetCatBreeds());
    }
}