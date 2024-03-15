package lk.bookworm.bookwormlibrarymanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BookDTO {

    private LocalDate dateOfBookEntity;
    private String bookID;
    private String bookName;
    private String bookAuthor;
    private String publisher;
    private String bookEdition;
    private String bookQTY;
    private String bookGenreType;
    private String bookPrice;

}
