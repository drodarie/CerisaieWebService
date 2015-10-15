package com.epul.service.impl;

import com.epul.dao.IClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.epul.persistence.Client;
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


    public List<Client> getAllClients() {
        return clientDAO.findAll();
    }

    public Client getClient(int id) {
        return clientDAO.findOne(id);
    }
}
