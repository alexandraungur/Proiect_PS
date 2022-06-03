package com.alecodes.studentsystem.logic;

import com.alecodes.studentsystem.factorypattern.UserFactory;
import com.alecodes.studentsystem.factorypattern.UserType;
import com.alecodes.studentsystem.model.Admin;
import com.alecodes.studentsystem.model.BasicUser;
import com.alecodes.studentsystem.model.Product;
import com.alecodes.studentsystem.service.AdminService;
import com.alecodes.studentsystem.service.ProductService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Base64;
import java.util.List;
import java.util.Optional;


/**
 * The type Admin logic.
 */
@Controller
public class AdminLogic {

    private final AdminService adminService;
    private UserFactory userFactory;
    /**
     * Instantiates a new Admin logic.
     *
     * @param adminService the admin service
     */
    @Autowired
    public AdminLogic(AdminService adminService) {
        this.adminService = adminService;
        this.userFactory=new UserFactory();
    }

    /**
     * Add admin string.
     *
     * @param admin the admin
     * @return the string
     */
    public String addAdmin(@RequestBody Admin admin){

        adminService.saveAdmin((Admin)userFactory.createUser((BasicUser)admin, UserType.ADMIN));
        return "New admin is added";
    }

    /**
     * Get admin list.
     *
     * @return the list
     */
    public List<Admin> getAdmin(){
        return adminService.getAdmin();
    }

    /**
     * Delete admin.
     *
     * @param idAdmin the id admin
     */
    public void deleteAdmin(int idAdmin){
        adminService.deleteAdmin(idAdmin);
    }

    /**
     * Update admin.
     *
     * @param idAdmin  the id admin
     * @param newAdmin the new admin
     */
    public void updateAdmin(int idAdmin, Admin newAdmin){
        Optional<Admin> admin= adminService.getAdminById((idAdmin));
        admin.ifPresent(ad -> {

                    ad.setName(newAdmin.getName());
                    ad.setUsername(newAdmin.getUsername());
                    ad.setPassword(newAdmin.getPassword());

                }
        );
    }
}
