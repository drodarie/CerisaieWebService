package com.epul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.epul.persistence.Client;
import com.epul.service.IClientService;

import java.util.List;

/**
 * Created by Dimitri on 13/10/2015.
 *
 * @version 1.0
 */
@RestController
public class ClientController {
    @Autowired
    private IClientService clientService;

    @RequestMapping("/Clients")
    public List<Client> getClients(){
        return clientService.getAllClients();
    }
}
