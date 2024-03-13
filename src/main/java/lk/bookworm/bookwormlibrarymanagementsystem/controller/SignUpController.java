package lk.bookworm.bookwormlibrarymanagementsystem.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class SignUpController {

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnSignUp;

    @FXML
    private AnchorPane root;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void btnBackOnAction(ActionEvent event) throws IOException {
        Parent load= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/login-page.fxml")));
        root.getChildren().clear();
        root.getChildren().add(load);

    }

    @FXML
    void btnSignUpOnAction(ActionEvent event) throws IOException {
        Parent load=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/login-page.fxml")));
        root.getChildren().clear();
        root.getChildren().add(load);

    }

}
