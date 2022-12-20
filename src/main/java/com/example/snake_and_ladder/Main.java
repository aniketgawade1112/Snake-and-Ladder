package com.example.snake_and_ladder;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static Group root;

    @Override
    public void start(Stage stage) throws IOException {
        root = new Group();
        GamePage page = new GamePage();
        root.getChildren().add(page.root);
        stage.setTitle("Snake and Ladder!");
        stage.setScene(new Scene(root, 800, 500));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}