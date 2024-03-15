package lk.bookworm.bookwormlibrarymanagementsystem.bo;

import lk.bookworm.bookwormlibrarymanagementsystem.dto.AdminDTO;
import lk.bookworm.bookwormlibrarymanagementsystem.dao.AdminDAO;

public class AdminBo {

    private AdminDAO adminDAO;

    public AdminBo(){
        adminDAO=new AdminDAO();
    }
    public boolean createAdmin(AdminDTO adminDTO) {
        return adminDAO.createAdmin(adminDTO);
    }
}
