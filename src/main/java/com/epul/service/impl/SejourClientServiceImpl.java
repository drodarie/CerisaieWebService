package com.epul.service.impl;

import com.epul.persistence.Sejour;
import com.epul.persistence.SejourClient;
import com.epul.service.IClientService;
import com.epul.service.ISejourClientService;
import com.epul.service.ISejourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Dimitri on 09/01/2016.
 * @Version 1.0
 */
@Service
public class SejourClientServiceImpl implements ISejourClientService {
    @Autowired
    private IClientService clientService;

    @Autowired
    private ISejourService sejourService;


    @Override
    public List<SejourClient> getAllSejours() {
        return sejourService.getAllSejours().stream()
                .map(sejour -> new SejourClient(sejour, clientService.getClient(sejour.getNumCli())))
                .collect(Collectors.toList());
    }

    @Override
    public SejourClient getSejour(int idSejour) {
        Sejour sejour = sejourService.getSejour(idSejour);
        return new SejourClient(sejour, clientService.getClient(sejour.getNumCli()));
    }
}
