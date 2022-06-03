package com.alecodes.studentsystem.service;

import com.alecodes.studentsystem.model.Client;

import java.util.List;
import java.util.Optional;

/**
 * The interface Client service.
 */
public interface ClientService {
    /**
     * Gets client.
     *
     * @return the client
     */
    List<Client> getClient();

    /**
     * Save client client.
     *
     * @param client the client
     * @return the client
     */
    public Client saveClient(Client client);

    /**
     * Delete client.
     *
     * @param idClient the id client
     */
    public void deleteClient(int idClient);

    /**
     * Gets client by id.
     *
     * @param idClient the id client
     * @return the client by id
     */
    Optional<Client> getClientById(int idClient);
}
