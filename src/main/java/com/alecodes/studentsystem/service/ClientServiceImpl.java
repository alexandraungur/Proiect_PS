package com.alecodes.studentsystem.service;

import com.alecodes.studentsystem.model.Client;
import com.alecodes.studentsystem.model.Product;
import com.alecodes.studentsystem.repository.ClientRepository;
import com.alecodes.studentsystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * The type Client service.
 */
@Service
public class ClientServiceImpl implements ClientService {

    /**
     * The Client repository.
     */
    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> getClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public void deleteClient(int idClient){
        clientRepository.deleteById(idClient);
    }

    @Override
    public Optional<Client> getClientById(int idClient) {
        return clientRepository.findById(idClient);
    }



}
