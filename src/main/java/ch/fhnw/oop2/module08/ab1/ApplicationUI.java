package ch.fhnw.oop2.module08.ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class ApplicationUI extends StackPane {

    private PresentationModel pm;
    private Button button;

    public ApplicationUI(PresentationModel pm){
        this.pm = pm;
        initializeControls();
        layoutControls();
    }

    public void initializeControls(){
        button = new Button();
        button.textProperty().bind(pm.buttonText());
    }

    public void layoutControls(){
        getChildren().add(button);
    }
}

