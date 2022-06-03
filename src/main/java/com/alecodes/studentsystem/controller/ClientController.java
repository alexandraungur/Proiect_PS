package com.alecodes.studentsystem.controller;

import com.alecodes.studentsystem.logic.AdminLogic;
import com.alecodes.studentsystem.logic.ClientLogic;
import com.alecodes.studentsystem.model.Admin;
import com.alecodes.studentsystem.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Client controller.
 */
@RestController
@RequestMapping(path="api/v1/client")
public class ClientController {

        @Autowired
        private ClientLogic clientLogic;

    /**
     * Get client list.
     *
     * @return the list
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getClient")
        public List<Client> getClient(){
            return clientLogic.getClient();
        }

    /**
     * Add string.
     *
     * @param client the client
     * @return the string
     */
    @PostMapping("/addClient")
        public String add(@RequestBody Client client){
            clientLogic.addClient(client);
            return "Added client";
        }

    /**
     * Delete client.
     *
     * @param idClient the id client
     * @return nothing
     */
    @DeleteMapping
        @RequestMapping(value = "/deleteClient/{idClient}")
        public void delete(@PathVariable int idClient){
            clientLogic.deleteClient(idClient);

        }

    /**
     * Update string.
     *
     * @param idClient the id client
     * @param client   the client
     * @return the string
     */
    @PutMapping
        @RequestMapping(value = "/updateClient/{id}")
        public String update(@PathVariable int idClient, @RequestBody Client client){
            clientLogic.updateClient(idClient, client);
            return "Updated client";
        }
}
