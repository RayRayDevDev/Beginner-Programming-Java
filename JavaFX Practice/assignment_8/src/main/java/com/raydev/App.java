package com.raydev;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    Label welcomeMessage = new Label("Welcome to Valencia's Sandwich Shop!");
    Label breadMessage = new Label("Please select a type of Bread: ");
    Label ingredientsMessage = new Label("Please select at least one filling: ");
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Valencia Sandwich Shop");
        StackPane rootPane = new StackPane();
        scene = new Scene(rootPane, 640, 480);
        VBox vBox = new VBox(welcomeMessage);
        vBox.setAlignment(Pos.TOP_CENTER);
        VBox vBox2 = new VBox(breadMessage);
        vBox2.setAlignment(Pos.CENTER_LEFT);
        VBox vBox3 = new VBox(ingredientsMessage);
        vBox3.setAlignment(Pos.CENTER_RIGHT);
        rootPane.getChildren().addAll(vBox, vBox2, vBox3);
        

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}