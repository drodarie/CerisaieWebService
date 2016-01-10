package com.epul.service.impl;

import com.epul.dao.IClientDAO;
import com.epul.dao.IEmplacementDAO;
import com.epul.dao.ISejourDAO;
import com.epul.dao.ITypeEmplacementDAO;
import com.epul.persistence.*;
import com.epul.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Laura on 10/01/2016.
 */
@Service
public class FactureServiceImpl implements IFactureService {



    @Autowired
    private ISejourClientService sejourClientService;

    @Autowired
    private IEmplacementService emplacementService;

    @Autowired
    private ITypeEmplacementService typeEmplacementService;

    @Autowired
    private IActiviteSportService activiteSportService;

    @Override
    public Facture getFactureForSejour(int numSej) {
        SejourClient sejour = sejourClientService.getSejour(numSej);
        Emplacement emplacement = emplacementService.getEmplacement(sejour.getNumEmpl());
        TypeEmplacement typeEmplacement = typeEmplacementService.getTypeEmplacement(emplacement.getCodeTypeE());
        List<ActiviteSport> activiteSport = activiteSportService.getActivitesBySejourId(numSej);

        Facture facture = new Facture(sejour,emplacement,typeEmplacement,activiteSport);

        return facture;
    }
}
