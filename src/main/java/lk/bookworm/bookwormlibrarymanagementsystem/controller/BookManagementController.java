package lk.bookworm.bookwormlibrarymanagementsystem.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BookManagementController {

    @FXML
    private TableView<?> booksTable;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnGetRecipt;

    @FXML
    private JFXButton btnSave;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private TableColumn<?, ?> colBookAuthor;

    @FXML
    private TableColumn<?, ?> colBookEdition;

    @FXML
    private TableColumn<?, ?> colBookID;

    @FXML
    private TableColumn<?, ?> colBookName;

    @FXML
    private TableColumn<?, ?> colBookPrice;

    @FXML
    private TableColumn<?, ?> colBookQTY;

    @FXML
    private TableColumn<?, ?> colDateOfBookEntry;

    @FXML
    private TableColumn<?, ?> colPublisher;

    @FXML
    private TextField txtBookAuthor;

    @FXML
    private TextField txtBookEdition;

    @FXML
    private TextField txtBookID;

    @FXML
    private TextField txtBookName;

    @FXML
    private TextField txtBookPrice;

    @FXML
    private TextField txtBookQTY;

    @FXML
    private DatePicker txtDateOfBookEntry;

    @FXML
    private TextField txtPublisher;

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnGetReciptOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}
