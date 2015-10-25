package com.epul.controller;

import com.epul.persistence.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(HttpStatus.OK)
    public List<Client> getClients(){
        return clientService.getAllClients();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Client getClient(@PathVariable(value="id") int id){
        return clientService.getClient(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteClient(@PathVariable(value="id") int id){
        return clientService.deleteClient(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public String addClient (@RequestBody Client client){
        return clientService.addClient(client);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public String modifyClient (@RequestBody Client client){
        return clientService.modifyClient(client);
    }
}
