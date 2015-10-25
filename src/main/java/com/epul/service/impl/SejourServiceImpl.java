package com.epul.service.impl;

import com.epul.dao.ISejourDAO;
import com.epul.persistence.Sejour;
import com.epul.service.ISejourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Corinne on 25/10/2015.
 *
 * @version 1.0
 */
@Service
public class SejourServiceImpl implements ISejourService {
    @Autowired
    private ISejourDAO sejourDAO;

    @Override
    public List<Sejour> getAllSejours() {
        return sejourDAO.findAll();
    }

    @Override
    public Sejour getSejour(int id) {
        return sejourDAO.findOne(id);
    }

    @Override
    public String modifySejour(Sejour sejour) {
        if (sejourDAO.findOne(sejour.getNumSej()) != null) {
            sejourDAO.save(sejour);
            return "Sejour modifie.";
        }
        return "Le sejour n'est pas connu.";
    }

    @Override
    public String deleteSejour(int id) {
        try {
            sejourDAO.delete(id);
            return "Sejour supprimé.";
        } catch (EmptyResultDataAccessException e) {
            return "Le sejour n'est pas connu.";
        }
    }

    @Override
    public String addSejour(Sejour sejour) {
        sejourDAO.save(sejour);
        return "Sejour ajouté.";
    }
}
