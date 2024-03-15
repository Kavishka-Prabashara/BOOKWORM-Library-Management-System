package lk.bookworm.bookwormlibrarymanagementsystem.controller;

import lk.bookworm.bookwormlibrarymanagementsystem.controller.EmailServiceController;
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

    private AdminBo adminBo;

    private EmailServiceController emailServiceController;


    public SignUpController(){
        adminBo=new AdminBo();
    }

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
        boolean success =adminBo.createAdmin(adminDTO);
        if (success) {
            new Alert(Alert.AlertType.INFORMATION, "Admin registered successfully!").show();
            Parent load=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/login-page.fxml")));
            root.getChildren().clear();
            root.getChildren().add(load);
            String subject = "Welcome to BookWorm Library!";
            String body = "\t\t\tCongratulation! "+email +"Your account has been successfully created!"+"\n\nYour User Name is :" +email+"\n"+"Your Password is :"+password;
            EmailServiceController.sendEmail(email, subject, body);

        } else {
            new Alert(Alert.AlertType.ERROR, "Error occurred while registering admin!").show();
        }



    }

}
