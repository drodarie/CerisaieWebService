package com.epul.service;

import com.epul.persistence.Activite;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Dimitri on 07/11/2015.
 */
public interface IActiviteService {
    List<Activite> getActivitesBySejourId(int id);

    List<Activite> getActivitesByCodeSportAndDateJour(int id, Timestamp date);
}
