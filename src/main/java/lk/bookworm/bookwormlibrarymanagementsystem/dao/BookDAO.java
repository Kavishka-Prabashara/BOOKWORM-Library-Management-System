package lk.bookworm.bookwormlibrarymanagementsystem.dao;

import lk.bookworm.bookwormlibrarymanagementsystem.config.FactoryConfiguration;
import lk.bookworm.bookwormlibrarymanagementsystem.dto.BookDTO;
import lk.bookworm.bookwormlibrarymanagementsystem.entity.AdminEntity;
import lk.bookworm.bookwormlibrarymanagementsystem.entity.BookEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookDAO {
    public boolean createBook(BookDTO bookDTO) {
        Session session = FactoryConfiguration.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            BookEntity newBook = new BookEntity();

            newBook.setDateOfBookEntry(bookDTO.getDateOfBookEntity());
            newBook.setBookID(bookDTO.getBookID());
            newBook.setBookName(bookDTO.getBookName());
            newBook.setBookAuthor(bookDTO.getBookAuthor());
            newBook.setBookEdition(bookDTO.getBookEdition());
            newBook.setPublisher(bookDTO.getPublisher());
            newBook.setBookQTY(bookDTO.getBookQTY());
            newBook.setBookGenreType(bookDTO.getBookGenreType());
            newBook.setBookPrice(bookDTO.getBookPrice());


            session.save(newBook);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
/*        } finally {
            session.close();
        }*/
        }
    }
}

