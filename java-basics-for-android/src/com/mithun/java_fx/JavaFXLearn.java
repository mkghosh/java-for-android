package com.mithun.java_fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Mithun Kumer Ghose on 5/11/2016.
 */
public class JavaFXLearn extends Application /*implements EventHandler<ActionEvent>*/ {

    Button btn1, btn2;

    public static void main(String... args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("This is my first JavaFX program.");

        btn1 = new Button("First Button");
        btn2 = new Button();
        btn2.setText("Second Button");

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.print("Button one has clicked");
            }
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(0, btn1);
//        layout.getChildren().add(1, btn2);

        Scene scene = new Scene(layout, 300, 300);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

//    @Override
//    public void handle(ActionEvent event) {
//
//    }
}
