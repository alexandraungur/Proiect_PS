package com.alecodes.studentsystem.controller;

import com.alecodes.studentsystem.factorypattern.UserFactory;
import com.alecodes.studentsystem.logic.AdminLogic;
import com.alecodes.studentsystem.logic.ProductLogic;
import com.alecodes.studentsystem.model.Admin;
import com.alecodes.studentsystem.model.Product;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Admin controller.
 */
@RestController
@RequestMapping(path="api/v1/admin")
public class AdminController {
    @Autowired
    private AdminLogic adminLogic;


    public AdminController(AdminLogic adminLogic) {
        this.adminLogic = adminLogic;

    }

    /**
     * Get admin list.
     *
     * @return the list
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getAdmin")
    public List<Admin> getAdmin(){
        return adminLogic.getAdmin();
    }

    /**
     * Add string.
     *
     * @param admin the admin
     * @return the string
     */
    @PostMapping("/addAdmin")
    public String add(@RequestBody Admin admin){

        adminLogic.addAdmin(admin);
        return "Added admin";
    }

    /**
     * Delete admin.
     *
     * @param idAdmin the id admin
     * @return nothing
     */
    @DeleteMapping
    @RequestMapping(value = "/deleteAdmin/{idAdmin}")
    public void delete(@PathVariable int idAdmin){
        adminLogic.deleteAdmin(idAdmin);

    }

    /**
     * Update string.
     *
     * @param idAdmin the id admin
     * @param admin   the admin
     * @return the string
     */
    @PutMapping
    @RequestMapping(value = "/updateAdmin/{id}")
    public String update(@PathVariable int idAdmin, @RequestBody Admin admin){
        adminLogic.updateAdmin(idAdmin, admin);
        return "Updated admin";
    }


}
