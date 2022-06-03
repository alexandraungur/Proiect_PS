package com.alecodes.studentsystem.service;

import com.alecodes.studentsystem.model.Admin;
import com.alecodes.studentsystem.model.Product;
import com.alecodes.studentsystem.repository.AdminRepository;
import com.alecodes.studentsystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * The type Admin service.
 */
@Service
public class AdminServiceImpl implements AdminService {

    /**
     * The Admin repository.
     */
    @Autowired
    AdminRepository adminRepository;

    @Override
    public List<Admin> getAdmin() {
        return adminRepository.findAll();
    }

    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public void deleteAdmin(int idAdmin){
        adminRepository.deleteById(idAdmin);
    }

    @Override
    public Optional<Admin> getAdminById(int idAdmin) {
        return adminRepository.findById(idAdmin);
    }

}
