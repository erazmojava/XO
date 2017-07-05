package sample;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.util.Duration;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    public GreenButton one;
    @FXML
    public GreenButton two;
    @FXML
    public GreenButton three;
    @FXML
    public GreenButton four;
    @FXML
    public GreenButton five;
    @FXML
    public GreenButton six;
    @FXML
    public GreenButton seven;
    @FXML
    public GreenButton eight;
    @FXML
    public GreenButton nine;

    private boolean next = true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        one.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(one);
                checkResult();
            }
        });
        two.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(two);
                checkResult();
            }
        });
        three.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(three);
                checkResult();
            }
        });
        four.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(four);
                checkResult();
            }
        });
        five.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(five);
                checkResult();
            }
        });
        six.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(six);
                checkResult();
            }
        });
        seven.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(seven);
                checkResult();
            }
        });
        eight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(eight);
                checkResult();
            }
        });
        nine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(nine);
                checkResult();
            }
        });

    }
    private void setText(GreenButton button){
        if (!button.getText().isEmpty()){
            return;
        }

        if (next){
            button.setText("X");
            next = false;
        } else {
            button.setText("O");
            next = true;
        }
    }
    private boolean checkResult(){
        if (equals(one, two, three)){
            one.setStyle("-fx-background-color: #ff1000");
            two.setStyle("-fx-background-color: #ff1000");
            three.setStyle("-fx-background-color: #ff1000");
            return  true;
        }

        if (equals(four, five, six)){
            four.setStyle("-fx-background-color: #ff1000");
            five.setStyle("-fx-background-color: #ff1000");
            six.setStyle("-fx-background-color: #ff1000");
            return  true;
        }

        if (equals(seven, eight, nine)){
            seven.setStyle("-fx-background-color: #ff1000");
            eight.setStyle("-fx-background-color: #ff1000");
            nine.setStyle("-fx-background-color: #ff1000");
            return  true;
        }

        if (equals(one, four, seven)){
            one.setStyle("-fx-background-color: #ff1000");
            four.setStyle("-fx-background-color: #ff1000");
            seven.setStyle("-fx-background-color: #ff1000");
            return  true;
        }

        if (equals(two, five, eight)){
            two.setStyle("-fx-background-color: #ff1000");
            five.setStyle("-fx-background-color: #ff1000");
            eight.setStyle("-fx-background-color: #ff1000");
            return  true;
        }

        if (equals(three, six, nine)){
            three.setStyle("-fx-background-color: #ff1000");
            six.setStyle("-fx-background-color: #ff1000");
            nine.setStyle("-fx-background-color: #ff1000");
            return  true;
        }

        if (equals(one, five, nine)){
            one.setStyle("-fx-background-color: #ff1000");
            five.setStyle("-fx-background-color: #ff1000");
            nine.setStyle("-fx-background-color: #ff1000");
            return  true;
        }

        if (equals(three, five, seven)){
            three.setStyle("-fx-background-color: #ff1000");
            five.setStyle("-fx-background-color: #ff1000");
            seven.setStyle("-fx-background-color: #ff1000");
            return  true;
        }

        return false;
    }

    private boolean equals(GreenButton b,GreenButton b1,GreenButton b2){
        return b.getText().equals(b1.getText()) && b1.getText().equals(b2.getText()) && !b.getText().isEmpty() && !b1.getText().isEmpty() && !b2.getText().isEmpty();
    }
}
