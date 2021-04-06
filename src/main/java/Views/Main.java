package Views;

import Controller.Controller;
import Models.CatModel;
import Models.CatViewModel;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        CatView theView = new CatView();
        CatViewModel theViewModel = new CatViewModel();
        Controller theController = new Controller(theView, theViewModel);

        for (CatModel cat: theViewModel.getBreedList()) {
            JLabel catLabel = new JLabel(cat.getName());

            theView.add(catLabel);

        }

        theView.setLayout(new GridLayout(10,10, 2, 2));
        theView.setSize(1000,500);
        theView.setVisible(true);
    }
}


