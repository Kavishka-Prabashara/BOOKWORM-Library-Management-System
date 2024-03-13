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

public class LoginController {

    @FXML
    private JFXButton btnLogin;

    @FXML
    private TextField txtPasswordLogin;

    @FXML
    private TextField txtUserNameLogin;

    @FXML
    private AnchorPane root;

    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {
        Parent load= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/dashboard-page.fxml")));
        root.getChildren().clear();
        root.getChildren().add(load);

    }

    @FXML
    void hypForgetPassword(ActionEvent event) throws IOException {
        Parent load=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/forget-page.fxml")));
        root.getChildren().clear();
        root.getChildren().add(load);

    }

    @FXML
    void hypSignUp(ActionEvent event) throws IOException {
        Parent load=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/signUp-page.fxml")));
        root.getChildren().clear();
        root.getChildren().add(load);

    }

    public void btnBookManagementOnAction(ActionEvent actionEvent) {
    }

    public void btnUserManagement(ActionEvent actionEvent) {
    }

    public void btnBranchManagementOnAction(ActionEvent actionEvent) {
    }

    public void btnSettingsOnAction(ActionEvent actionEvent) {

    }

    public void hypLogoutOnAction(ActionEvent actionEvent) {

    }
}
