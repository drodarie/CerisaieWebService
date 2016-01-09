package com.epul.service;

import com.epul.persistence.SejourClient;

import java.util.List;

/**
 * @Author Dimitri on 09/01/2016.
 * @Version 1.0
 */
public interface ISejourClientService {
    List<SejourClient> getAllSejours();

    SejourClient getSejour(int idSejour);
}
