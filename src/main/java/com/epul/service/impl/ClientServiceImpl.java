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
    public String modifyClient(int id, String nom, String adresse, int cpClient, String ville, String pieceCli, int nbPiece) {
        Client client = clientDAO.findOne(id);
        if (client!=null){
            client.setNomCli(nom);
            client.setAdrRueCli(adresse);
            client.setCpCli(cpClient);
            client.setVilleCli(ville);
            client.setPieceCli(pieceCli);
            client.setNumPieceCli(nbPiece);
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
        if (clientDAO.findOne(client.getNumCli())==null){
            clientDAO.save(client);
            return "Client ajouté.";
        }
        return "Le client existe déjà.";
    }
}
