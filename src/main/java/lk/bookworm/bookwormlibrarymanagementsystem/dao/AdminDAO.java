package lk.bookworm.bookwormlibrarymanagementsystem.dao;

import lk.bookworm.bookwormlibrarymanagementsystem.config.FactoryConfiguration;
import lk.bookworm.bookwormlibrarymanagementsystem.dto.AdminDTO;
import lk.bookworm.bookwormlibrarymanagementsystem.entity.AdminEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AdminDAO {
    public boolean createAdmin(AdminDTO adminDTO) {
        Session session = FactoryConfiguration.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            AdminEntity newAdmin = new AdminEntity();

            newAdmin.setEmail(adminDTO.getEmail()); // Set email from AdminDTO
            newAdmin.setUsername(adminDTO.getUsername()); // Set username from AdminDTO
            newAdmin.setPassword(adminDTO.getPassword()); // Set password from AdminDTO

            session.save(newAdmin);
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