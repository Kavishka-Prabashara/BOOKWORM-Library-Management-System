package lk.bookworm.bookwormlibrarymanagementsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="books_details")
public class BookEntity {

    @Column(name = "dateOfBookEntry" ,unique = false, nullable = true)
    private LocalDate dateOfBookEntry;

    @Id
    @Column(name = "bookID")
    private String bookID;

    @Column(name = "bookName" ,unique = false, nullable = true)
    private String bookName;

    @Column(name = "bookAuthor" ,unique = false, nullable = true)
    private String bookAuthor;
    @Column(name = "publisher" ,unique = false, nullable = true)
    private String publisher;

    @Column(name = "bookEdition" ,unique = false, nullable = true)
    private String bookEdition;

    @Column(name = "bookQTY" ,unique = false, nullable = true)
    private int bookQTY;

    @Column(name = "bookGenreType" ,unique = false, nullable = true)
    private String bookGenreType;

    @Column(name = "bookPrice" ,unique = false, nullable = true)
    private double bookPrice;

    @Override
    public String toString() {
        return "BookEntity{" +
                "dateOfBookEntity='" + dateOfBookEntry + '\'' +
                ",bookID='" + bookID + '\'' +
                ",bookName='" + bookName + '\'' +
                ",bookAuthor='" + bookAuthor + '\'' +
                ",publisher='" + publisher + '\'' +
                ",bookEdition='" + bookEdition + '\'' +
                ",bookQTY='" + bookQTY + '\'' +
                ",bookGenreType='" + bookGenreType + '\'' +
                ",bookPrice='" + bookPrice + '\'' +
                '}';
    }


}
