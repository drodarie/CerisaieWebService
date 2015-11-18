package com.epul.service.impl;

import com.epul.dao.ITypeEmplacementDAO;
import com.epul.persistence.TypeEmplacement;
import com.epul.service.ITypeEmplacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Dimitri on 18/11/2015.
 */
@Service
public class TypeEmplacementServiceImpl implements ITypeEmplacementService {
    @Autowired
    private ITypeEmplacementDAO typeEmplacementDAO;


    @Override
    public TypeEmplacement getTypeEmplacement(int id) {
        return typeEmplacementDAO.findOne(id);
    }
}
