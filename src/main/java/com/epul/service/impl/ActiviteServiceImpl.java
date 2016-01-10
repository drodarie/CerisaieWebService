package com.epul.service.impl;

import com.epul.dao.IActiviteDAO;
import com.epul.persistence.Activite;
import com.epul.persistence.ActivitePK;
import com.epul.service.IActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
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

    @Override
    public List<Activite> getActivitesByCodeSportAndDateJour(int id, Timestamp date) {
        return activiteDAO.findByCodeSportAndDateJour(id, date);
    }

    @Override
    public String deleteActivite(int numSej, int numSport, Timestamp date) {
        try{

            ActivitePK activitePK = new ActivitePK();
            activitePK.setCodeSport(numSport);
            activitePK.setDateJour(date);
            activitePK.setNumSej(numSej);
            Activite activite = activiteDAO.findOne(activitePK);
                    //findByCodeSportNumSejAndDateJour(numSport,numSej,date);
            activiteDAO.delete(activite);
            return "Activité supprimée";
        }catch (EmptyResultDataAccessException e){
            return "L'activité n'est pas connue.";
        }
    }

    @Override
    public String addActivite(Activite activite) {
        activiteDAO.save(activite);
        return "Activité ajoutée.";
    }
}
