package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Przemysław Konik on 2017-05-28.
 */
public class WindowController implements Initializable {
    @FXML
    private Label label;

    public void initialize(URL location, ResourceBundle resources) {
        setLabel("Hello World");
    }

    public void setLabel(String text) {
        label.setText(text);
    }
}
