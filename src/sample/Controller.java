package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {
    @FXML
    private Label skaicius;
    @FXML
    private TextField spejimas;

    public void speti(ActionEvent e) {
        Random random = new Random();
        int x = random.nextInt(10)+1;
        int y = Integer.parseInt(spejimas.getText());
        if (x==y){
            skaicius.setText("Saunuole");
        }else {
            skaicius.setText("Neatspejai :P " + x);
        }

    }

    public void baigti(ActionEvent b) {
        System.exit(0);

    }
}


