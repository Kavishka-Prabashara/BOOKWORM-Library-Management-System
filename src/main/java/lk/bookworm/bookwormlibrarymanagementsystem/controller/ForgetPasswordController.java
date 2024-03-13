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

public class ForgetPasswordController {

    @FXML
    private JFXButton btnCancel;

    @FXML
    private JFXButton btnConfirm;

    @FXML
    private TextField txtEmailForget;

    @FXML
    private TextField txtPasswordForget;

    @FXML
    private TextField txtPasswordForgetConfirm;

    @FXML
    private AnchorPane root;

    @FXML
    void btnCancelOnAction(ActionEvent event) throws IOException {
        Parent load= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/login-page.fxml")));
        root.getChildren().clear();
        root.getChildren().add(load);
    }

    @FXML
    void btnConfirmOnAction(ActionEvent event) throws IOException {
        Parent load=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/login-page.fxml")));
        root.getChildren().clear();
        root.getChildren().add(load);

    }

}
