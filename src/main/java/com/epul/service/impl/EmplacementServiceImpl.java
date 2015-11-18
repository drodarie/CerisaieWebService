package com.epul.service.impl;

import com.epul.dao.IEmplacementDAO;
import com.epul.persistence.Emplacement;
import com.epul.service.IEmplacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Dimitri on 18/11/2015.
 */
@Service
public class EmplacementServiceImpl implements IEmplacementService {
    @Autowired
    private IEmplacementDAO emplacementDAO;


    @Override
    public Emplacement getEmplacement(int id) {
        return emplacementDAO.findOne(id);
    }
}
