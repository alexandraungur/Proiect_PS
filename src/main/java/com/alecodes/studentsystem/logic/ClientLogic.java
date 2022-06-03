package com.alecodes.studentsystem.logic;

import com.alecodes.studentsystem.factorypattern.UserFactory;
import com.alecodes.studentsystem.factorypattern.UserType;
import com.alecodes.studentsystem.model.Admin;
import com.alecodes.studentsystem.model.BasicUser;
import com.alecodes.studentsystem.model.Client;
import com.alecodes.studentsystem.service.AdminService;
import com.alecodes.studentsystem.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

/**
 * The type Client logic.
 */
@Controller
public class ClientLogic {
    private final ClientService clientService;
    private UserFactory userFactory;

    /**
     * Instantiates a new Client logic.
     *
     * @param clientService the client service
     */
    @Autowired
    public ClientLogic(ClientService clientService) {
        this.clientService = clientService;
        this.userFactory= new UserFactory();
    }

    /**
     * Add client string.
     *
     * @param client the client
     * @return the string
     */
    public String addClient(@RequestBody Client client){
        clientService.saveClient((Client)userFactory.createUser((BasicUser)client, UserType.CLIENT ));
        return "New client is added";
    }

    /**
     * Get client list.
     *
     * @return the list
     */
    public List<Client> getClient(){
        return clientService.getClient();
    }

    /**
     * Delete client.
     *
     * @param idClient the id client
     */
    public void deleteClient(int idClient){
        clientService.deleteClient(idClient);
    }

    /**
     * Update client.
     *
     * @param idClient  the id client
     * @param newClient the new client
     */
    public void updateClient(int idClient, Client newClient){
        Optional<Client> client= clientService.getClientById((idClient));
        client.ifPresent(cl -> {

                    cl.setName(newClient.getName());
                    cl.setUsername(newClient.getUsername());
                    cl.setPassword(newClient.getPassword());
                    cl.setEmail(newClient.getEmail());
                    cl.setAddress(newClient.getAddress());
                    cl.setPhone_number(newClient.getPhone_number());

                }
        );
    }
}
