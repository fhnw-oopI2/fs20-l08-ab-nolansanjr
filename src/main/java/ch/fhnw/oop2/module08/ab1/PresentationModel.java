package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;


public final class PresentationModel {

    private SimpleStringProperty buttonText;
    private SimpleStringProperty windowTitle;

    public PresentationModel(){
        buttonText = new SimpleStringProperty("Hello World!");
        windowTitle = new SimpleStringProperty("JavaFX Application");
    }

    public SimpleStringProperty buttonText() {
        return buttonText;
    }

    public SimpleStringProperty windowTitle(){
        return windowTitle;
    }
}
