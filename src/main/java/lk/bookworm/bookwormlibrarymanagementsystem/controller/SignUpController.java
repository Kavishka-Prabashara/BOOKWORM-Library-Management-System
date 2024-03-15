package lk.bookworm.bookwormlibrarymanagementsystem.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

import lk.bookworm.bookwormlibrarymanagementsystem.bo.AdminBo;
import lk.bookworm.bookwormlibrarymanagementsystem.dto.AdminDTO;

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
    private PasswordField txtPassword;

    @FXML
    private TextField txtConfirmPassword;

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
        String email= txtEmail.getText();
        String userName=txtUserName.getText();
        String password=txtPassword.getText();
        String confirmPassword=txtConfirmPassword.getText();



        if (!password.equals(confirmPassword)) {
            new Alert(Alert.AlertType.ERROR, "Password is not match!!!").show();
            return;
        }

        AdminDTO adminDTO = new AdminDTO(email,userName,password);
        Parent load=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/login-page.fxml")));
        root.getChildren().clear();
        root.getChildren().add(load);

    }

}
