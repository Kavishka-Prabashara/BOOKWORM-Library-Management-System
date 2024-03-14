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
import javafx.scene.control.Hyperlink;
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

public class DashBoardController implements Initializable {

    @FXML
    private JFXButton btnBookManagement;

    @FXML
    private JFXButton btnBranchManagement;

    @FXML
    private JFXButton btnSettings;

    @FXML
    private JFXButton btnUserManagement;

    @FXML
    private Hyperlink hypLogout;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblTime;

    @FXML
    private Label lblUserName;
    @FXML
    private AnchorPane pane;

    @FXML
    private AnchorPane anchorpane;


    public void btnBookManagementOnAction(ActionEvent actionEvent) throws IOException {
        Parent load= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/bookManagement-page.fxml")));
        pane.getChildren().clear();
        pane.getChildren().add(load);

    }

    public void btnUserManagement(ActionEvent actionEvent) throws IOException {
        Parent load= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/userManagement-page.fxml")));
        pane.getChildren().clear();
        pane.getChildren().add(load);

    }

    public void btnBranchManagementOnAction(ActionEvent actionEvent) throws IOException {
        Parent load= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/branchManagement-page.fxml")));
        pane.getChildren().clear();
        pane.getChildren().add(load);

    }

    public void btnSettingsOnAction(ActionEvent actionEvent) throws IOException {
        Parent load= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/settings-page.fxml")));
        pane.getChildren().clear();
        pane.getChildren().add(load);


    }

    public void hypLogoutOnAction(ActionEvent actionEvent) throws IOException {
        Parent load= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/login-page.fxml")));
        anchorpane.getChildren().clear();
        anchorpane.getChildren().add(load);


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
