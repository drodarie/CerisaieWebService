package com.epul.service.impl;

import com.epul.dao.IClientDAO;
import com.epul.persistence.Client;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import com.epul.service.IClientService;

import java.util.List;

/**
 * Created by Dimitri on 13/10/2015.
 *
 * @version 1.0
 */
@Service
public class ClientServiceImpl implements IClientService {
    @Autowired
    private IClientDAO clientDAO;

    @Override
    public List<Client> getAllClients() {
        return clientDAO.findAll();
    }

    @Override
    public Client getClient(int id) {
        return clientDAO.findOne(id);
    }

    @Override
    public String modifyClient(Client client) {
        if (clientDAO.findOne(client.getNumCli())!=null){
            clientDAO.save(client);
            return "Client modifié.";
        }
        return "Le client n'est pas connu.";
    }

    @Override
    public String deleteClient(int id) {
        try{
            clientDAO.delete(id);
            return "Client supprimé.";
        }catch (EmptyResultDataAccessException e){
            return "Le client n'est pas connu.";
        }
    }

    @Override
    public String addClient(Client client) {
        clientDAO.save(client);
        return "Client ajouté.";
    }
}
