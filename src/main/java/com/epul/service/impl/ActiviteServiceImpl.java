package com.epul.service.impl;

import com.epul.dao.IActiviteDAO;
import com.epul.persistence.Activite;
import com.epul.service.IActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dimitri on 07/11/2015.
 */
@Service
public class ActiviteServiceImpl implements IActiviteService {
    @Autowired
    private IActiviteDAO activiteDAO;

    @Override
    public List<Activite> getActivitesBySejourId(int id) {
        return activiteDAO.findByNumSej(id);
    }
}
