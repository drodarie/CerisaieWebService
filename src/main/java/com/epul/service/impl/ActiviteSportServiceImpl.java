package com.epul.service.impl;

import com.epul.persistence.ActiviteSport;
import com.epul.service.IActiviteService;
import com.epul.service.IActiviteSportService;
import com.epul.service.ISportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Dimitri on 09/01/2016.
 * @Version 1.0
 */
@Service
public class ActiviteSportServiceImpl implements IActiviteSportService {
    @Autowired
    private ISportService sportService;

    @Autowired
    private IActiviteService activiteService;

    @Override
    public List<ActiviteSport> getActivitesBySejourId(int id) {
        return activiteService.getActivitesBySejourId(id).stream()
                .map(activite -> new ActiviteSport(activite, sportService.getSport(activite.getCodeSport())))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
