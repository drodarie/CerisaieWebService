package com.epul.controller;

import com.epul.persistence.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.epul.service.IClientService;

import java.util.List;

/**
 * Created by Dimitri on 13/10/2015.
 *
 * @version 1.0
 */
@RestController
@RequestMapping("/Clients")
public class ClientController {
    @Autowired
    private IClientService clientService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Client> getClients(){
        return clientService.getAllClients();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Client getClient(@PathVariable(value="id") int id){
        return clientService.getClient(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public String deleteClient(@PathVariable(value="id") int id){
        return clientService.deleteClient(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addClient (@ModelAttribute("client") Client client){
        return clientService.addClient(client);
    }
}
