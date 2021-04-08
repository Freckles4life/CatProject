package Views;

import Controller.Controller;
import Models.CatViewModel;

public class Main {

    public static void main(String[] args) {
            CatView theView = new CatView();
            CatViewModel theViewModel = new CatViewModel();
            Controller theController = new Controller(theView, theViewModel);
        }
}


