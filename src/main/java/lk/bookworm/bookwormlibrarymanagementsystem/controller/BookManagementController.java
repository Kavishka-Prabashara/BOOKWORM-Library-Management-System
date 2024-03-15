package lk.bookworm.bookwormlibrarymanagementsystem.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import lk.bookworm.bookwormlibrarymanagementsystem.dto.BookDTO;
import lk.bookworm.bookwormlibrarymanagementsystem.bo.BookBO;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

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
    private TableColumn<?, ?> colBookGenreType;

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
    private TextField txtBookGenreType;

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

    private BookBO bookBO;

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnGetReciptOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) throws IOException {

        LocalDate dateOfBookEntity= txtDateOfBookEntry.getValue();
        String bookID= txtBookID.getText();
        String bookName = txtBookName.getText();
        String bookAuthor =txtBookAuthor.getText();
        String publisher=txtPublisher.getText();
        String bookEdition=txtBookEdition.getText();
        int bookQTY = Integer.parseInt(txtBookQTY.getText());
        String bookGenreType=txtBookGenreType.getText();
        double bookPrice = Double.parseDouble(txtBookPrice.getText());



        BookDTO bookDTO = new BookDTO(dateOfBookEntity,bookID,bookName,bookAuthor,publisher,bookEdition,bookQTY,bookGenreType,bookPrice);
        boolean success =bookBO.createBook(bookDTO);
        if (success) {
            new Alert(Alert.AlertType.INFORMATION, "Book registered successfully!").show();

        } else {
            new Alert(Alert.AlertType.ERROR, "Error occurred while registering Book!").show();
        }

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}
