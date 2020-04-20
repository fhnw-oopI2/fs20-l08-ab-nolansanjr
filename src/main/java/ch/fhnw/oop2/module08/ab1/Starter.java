package ch.fhnw.oop2.module08.ab1;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Starter extends Application{

    public void start (javafx.stage.Stage stage){

        PresentationModel pm = new PresentationModel();

        Parent rootPanel = new ApplicationUI(pm);
        Scene scene = new Scene(rootPanel);

        stage.titleProperty().bind(pm.getWindowTitle());
        stage.setScene(scene);
        stage.setWidth(400);
        stage.setHeight(300);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
