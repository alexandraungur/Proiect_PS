package com.alecodes.studentsystem.model;

import javax.persistence.*;

/**
 * The type Client.
 */
@Entity
@Table(name = "client")

public class Client implements BasicUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_client")
    private int id_client;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "e-mail")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private int phone_number;

    /**
     * Instantiates a new Client.
     */
    public Client() {

    }

    /**
     * Instantiates a new Client.
     *
     * @param name         the name
     * @param username     the username
     * @param password     the password
     * @param email        the email
     * @param address      the address
     * @param phone_number the phone number
     */
    public Client(String name, String username, String password, String email, String address, int phone_number) {
        this.name=name;
        this.username= username;
        this.password=password;
        this.email = email;
        this.address = address;
        this.phone_number = phone_number;
    }

    /**
     * Gets id client.
     *
     * @return the id client
     */
    public int getId_client() {
        return id_client;
    }

    /**
     * Sets id client.
     *
     * @param id_client the id client
     */
    public void setId_client(int id_client) {
        this.id_client = id_client;
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

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets phone number.
     *
     * @return the phone number
     */
    public int getPhone_number() {
        return phone_number;
    }

    /**
     * Sets phone number.
     *
     * @param phone_number the phone number
     */
    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
}