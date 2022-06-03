package com.alecodes.studentsystem.service;

import com.alecodes.studentsystem.model.Admin;

import java.util.List;
import java.util.Optional;

/**
 * The interface Admin service.
 */
public interface AdminService {
    /**
     * Gets admin.
     *
     * @return the admin
     */
    List<Admin> getAdmin();

    /**
     * Save admin admin.
     *
     * @param admin the admin
     * @return the admin
     */
    public Admin saveAdmin(Admin admin);

    /**
     * Delete admin.
     *
     * @param idAdmin the id admin
     */
    public void deleteAdmin(int idAdmin);

    /**
     * Gets admin by id.
     *
     * @param idAdmin the id admin
     * @return the admin by id
     */
    Optional<Admin> getAdminById(int idAdmin);

}
