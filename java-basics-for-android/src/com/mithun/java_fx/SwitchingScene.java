package com.mithun.java_fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Mithun Kumer Ghose on 5/11/2016.
 */
public class SwitchingScene extends Application {

    Stage wholeWindow;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception {

        wholeWindow = primaryStage;

        Label label = new Label("This is label 1");
        Button button1 = new Button("Go to scene2");
        button1.setOnAction(event -> wholeWindow.setScene(scene2));

        VBox vBox = new VBox(20);
        vBox.getChildren().addAll(label,button1);
        scene1 = new Scene(vBox, 200, 200);

        Label label1 = new Label("This is lable 2");
        StackPane layout = new StackPane();
        layout.getChildren().add(label1);

        Button button = new Button("Go to scene 1");
        button.setOnAction(event -> wholeWindow.setScene(scene1));
        layout.getChildren().add(button);
        scene2 = new Scene(layout, 500, 200);

        wholeWindow.setScene(scene1);
        wholeWindow.setTitle("This is the whole window");
        wholeWindow.show();
    }
}
