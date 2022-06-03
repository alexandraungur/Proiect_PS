package com.alecodes.studentsystem.model;

import javax.persistence.*;

/**
 * The type Admin.
 */
@Entity
@Table(name = "admin")

public class Admin implements BasicUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_admin")
    private int id_admin;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    /**
     * Instantiates a new Admin.
     */
    public Admin() {

    }

    /**
     * Instantiates a new Admin.
     *
     * @param name     the name
     * @param username the username
     * @param password the password
     */
    public Admin(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    /**
     * Gets id admin.
     *
     * @return the id admin
     */
    public int getId_admin() {
        return id_admin;
    }

    /**
     * Sets id admin.
     *
     * @param id_admin the id admin
     */
    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}