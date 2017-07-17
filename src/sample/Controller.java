package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.*;


import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private static final String resetStyle = "-fx-background-color: #33FF5F; -fx-font-size: 30";

    public void reset() {
        one.setText("");
        two.setText("");
        three.setText("");
        four.setText("");
        five.setText("");
        six.setText("");
        seven.setText("");
        eight.setText("");
        nine.setText("");

        one.setStyle(resetStyle);
        two.setStyle(resetStyle);
        three.setStyle(resetStyle);
        four.setStyle(resetStyle);
        five.setStyle(resetStyle);
        six.setStyle(resetStyle);
        seven.setStyle(resetStyle);
        eight.setStyle(resetStyle);
        nine.setStyle(resetStyle);
    }


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
                try {
                    checkResult();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


        two.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(two);
                try {
                    checkResult();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        three.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(three);
                try {
                    checkResult();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        four.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(four);
                try {
                    checkResult();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        five.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(five);
                try {
                    checkResult();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        six.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(six);
                try {
                    checkResult();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        seven.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(seven);
                try {
                    checkResult();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        eight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(eight);
                try {
                    checkResult();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        nine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setText(nine);
                try {
                    checkResult();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }


    private void setText(GreenButton button) {

        if (!button.getText().isEmpty()) {
            alert();

            return;
        }

        if (next) {
            button.setText("X");
            next = false;
        } else {
            button.setText("O");
            next = true;
        }


    }


    private boolean checkResult() throws IOException {

        int i;
        if (equals(one, two, three)) {
            one.setStyle("-fx-background-color: #ff1000");
            two.setStyle("-fx-background-color: #ff1000");
            three.setStyle("-fx-background-color: #ff1000");
            alert();
            return true;


        }


        if (equals(four, five, six)) {
            four.setStyle("-fx-background-color: #ff1000");
            five.setStyle("-fx-background-color: #ff1000");
            six.setStyle("-fx-background-color: #ff1000");
            alert();
            return true;
        }

        if (equals(seven, eight, nine)) {
            seven.setStyle("-fx-background-color: #ff1000");
            eight.setStyle("-fx-background-color: #ff1000");
            nine.setStyle("-fx-background-color: #ff1000");
            alert();
            return true;
        }

        if (equals(one, four, seven)) {
            one.setStyle("-fx-background-color: #ff1000");
            four.setStyle("-fx-background-color: #ff1000");
            seven.setStyle("-fx-background-color: #ff1000");
            alert();
            return true;
        }

        if (equals(two, five, eight)) {
            two.setStyle("-fx-background-color: #ff1000");
            five.setStyle("-fx-background-color: #ff1000");
            eight.setStyle("-fx-background-color: #ff1000");
            alert();
            return true;
        }

        if (equals(three, six, nine)) {
            three.setStyle("-fx-background-color: #ff1000");
            six.setStyle("-fx-background-color: #ff1000");
            nine.setStyle("-fx-background-color: #ff1000");
            alert();
            return true;
        }

        if (equals(one, five, nine)) {
            one.setStyle("-fx-background-color: #ff1000");
            five.setStyle("-fx-background-color: #ff1000");
            nine.setStyle("-fx-background-color: #ff1000");
            alert();
            return true;
        }

        if (equals(three, five, seven)) {
            three.setStyle("-fx-background-color: #ff1000");
            five.setStyle("-fx-background-color: #ff1000");
            seven.setStyle("-fx-background-color: #ff1000");
            alert();
            return true;

        }
        return false;

    }


    private boolean equals(GreenButton b, GreenButton b1, GreenButton b2) {
        return b.getText().equals(b1.getText()) && b1.getText().equals(b2.getText()) && !b.getText().isEmpty() && !b1.getText().isEmpty() && !b2.getText().isEmpty();
    }


    public void alert() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("GAME IS OVER!!!");
        alert.setHeaderText("GAME IS OVER!!!");
        alert.setContentText("DO YOU WANT A START NEW GAME?");

        ButtonType buttonTypeOne = new ButtonType("YES");
        ButtonType buttonTypeTwo = new ButtonType("NO");
        ButtonType buttonTypeCancel = new ButtonType("EXIT", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeCancel);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonTypeOne) {
            reset();
            return;

            // ... user chose "One"
        } else if (result.get() == buttonTypeTwo) {
            return;
            // ... user chose "Two"
        } else {
            Platform.exit();
            // ... user chose CANCEL or closed the dialog
        }
    }


}

