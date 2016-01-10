package com.epul.service.impl;

import com.epul.dao.ISportDAO;
import com.epul.persistence.Sport;
import com.epul.service.ISportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dimitri on 07/11/2015.
 */
@Service
public class SportServiceImpl implements ISportService {
    @Autowired
    private ISportDAO sportDAO;

    @Override
    public Sport getSport(int id) {
        return sportDAO.findOne(id);
    }

    @Override
    public List<Sport> getAllSport() {
        return sportDAO.findAll();
    }
}
