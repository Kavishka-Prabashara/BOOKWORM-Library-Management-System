package lk.bookworm.bookwormlibrarymanagementsystem.bo;

import lk.bookworm.bookwormlibrarymanagementsystem.dao.AdminDAO;
import lk.bookworm.bookwormlibrarymanagementsystem.dto.AdminDTO;
import lk.bookworm.bookwormlibrarymanagementsystem.dto.BookDTO;
import lk.bookworm.bookwormlibrarymanagementsystem.dao.BookDAO;


public class BookBO {

    private BookDTO bookDTO;
    private BookDAO bookDAO;
    public boolean createBook(BookDTO bookDTO) {
        return bookDAO.createBook(bookDTO);
    }

    public BookBO(){
            bookDAO=new BookDAO();
        }

    }

