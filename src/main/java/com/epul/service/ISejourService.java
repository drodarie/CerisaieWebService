package com.epul.service;

import com.epul.persistence.Sejour;

import java.util.List;

/**
 * Created by Corinne on 25/10/2015.
 *
 * @version 1.0
 */
public interface ISejourService {
    List<Sejour> getAllSejours();

    Sejour getSejour(int id);

    String modifySejour(Sejour sejour);

    String deleteSejour(int id);

    String addSejour(Sejour sejour);
}
