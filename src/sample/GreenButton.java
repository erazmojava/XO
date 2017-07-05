package sample;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.util.Duration;

/**
 * Created by osman on 7/3/17.
 */
public class GreenButton extends Button {
    public GreenButton() {
        setStyle("-fx-background-color: #33FF5F; -fx-font-size: 30");
        setPrefHeight(100);
        setPrefWidth(100);
    }

    public GreenButton(String text) {
        super(text);
        setStyle("-fx-background-color: #33FF5F;");
    }

    public GreenButton(String text, Node graphic) {
        super(text, graphic);
        setStyle("-fx-background-color: #33FF5F;");
    }
}
