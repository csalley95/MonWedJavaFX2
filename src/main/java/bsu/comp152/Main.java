package bsu.comp152;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){
        VBox box = new VBox();
        var windowPane = new Scene(box);
        primaryStage.setScene(windowPane);
        var numberDisplay = new TextField();
        numberDisplay.setEditable(false);
        box.getChildren().add(numberDisplay);
        HBox buttonBox = new HBox();
        box.getChildren().add(buttonBox);
        for(int num = 1; num <= 3; num++){
            var button = new Button(""+num);
            buttonBox.getChildren().add(button);
            button.setMinWidth(50);
            var eventResponder = new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event){
                    Button numberButton = (Button)event.getSource();
                    String longerNumber = numberDisplay.getText()+ numberButton.getText();
                    numberDisplay.setText(longerNumber);
                }
            };
            button.setOnAction(eventResponder);
        }
        primaryStage.show();


    }
//    @Override
//    public void start(Stage primaryStage) {
//        VBox box = new VBox();
//        var text = new Label("Hello Comp152");
//        var color = Paint.valueOf("Blue");
//        text.setTextFill(color);
//        var font = Font.font(32);
//        text.setFont(font);
//        box.getChildren().add(text);
//        box.setSpacing(10);
//        var input = new TextField();
//        input.setFont(font);
//        Button pushButton = new Button("Push me");
//        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                var test = input.getText();
//                text.setText(test);
//            }
//        };
//        pushButton.setOnAction(handler);
//        pushButton.setFont(font);
//        box.getChildren().add(pushButton);
//        box.getChildren().add(input);
//        var firstScene = new Scene(box);
//        primaryStage.setScene(firstScene);
//        primaryStage.setTitle("Example Window");
//        primaryStage.show();
//
//    }
}
