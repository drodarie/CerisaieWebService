package com.epul.service;

import com.epul.persistence.Client;

import java.util.List;

/**
 * Created by Dimitri on 13/10/2015.
 *
 * @version 1.0
 */
public interface IClientService {
    List<Client> getAllClients();

    Client getClient(int id);

    String modifyClient(Client client);

    String deleteClient(int id);

    String addClient(Client client);
}
