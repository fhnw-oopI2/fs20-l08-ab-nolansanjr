package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.SimpleStringProperty;

public class PresentationModel {

    SimpleStringProperty buttonText;
    SimpleStringProperty windowTitle;

    public PresentationModel(){
        buttonText = new SimpleStringProperty(State.ON.toString());
        windowTitle = new SimpleStringProperty("Toggle Application");
    }

    public void ButtonState() {
        if (getButtonText() == State.ON.toString()) {
            setButtonText(State.OFF.toString());
        }
        else setButtonText(State.ON.toString());
    }

    public void setWindowTitle(String windowTitle) {
        this.windowTitle.set(windowTitle);
    }

    public String getWindowTitle() {
        return windowTitle.get();
    }

    public String getButtonText() {
        return buttonText.get();
    }

    public void setButtonText(String buttonText) {
        this.buttonText.set(buttonText);
    }

}
