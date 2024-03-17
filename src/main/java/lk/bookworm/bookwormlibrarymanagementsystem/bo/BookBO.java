package lk.bookworm.bookwormlibrarymanagementsystem.bo;


import lk.bookworm.bookwormlibrarymanagementsystem.dto.BookDTO;
import lk.bookworm.bookwormlibrarymanagementsystem.dao.BookDAO;


public class BookBO {

    private BookDAO bookDAO;
    public BookBO(){bookDAO=new BookDAO();}
    public boolean createBook(BookDTO bookDTO) {return bookDAO.createBook(bookDTO);}



    }

