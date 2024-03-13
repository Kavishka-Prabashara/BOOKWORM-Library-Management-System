package lk.bookworm.bookwormlibrarymanagementsystem.controller;

import com.jfoenix.controls.JFXButton;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.ResourceBundle;

public class WelcomeController  implements Initializable {

    @FXML
    private JFXButton btnWelcomeclick;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblTime;

    @FXML
    private AnchorPane root;

    @FXML
    void btnWelcomeclickOnAction(ActionEvent event) throws IOException {
        Parent load= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/login-page.fxml")));
        root.getChildren().clear();
        root.getChildren().add(load);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialize date and time
        generateDate();
        generateTime();

        // Create a Timeline to update date and time every second
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            generateDate();
            generateTime();
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private void generateTime() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        lblTime.setText(LocalTime.now().format(timeFormatter));
    }

    private void generateDate() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        lblDate.setText(LocalDate.now().format(dateFormatter));
    }

}
