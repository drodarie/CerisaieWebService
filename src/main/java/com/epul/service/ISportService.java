package com.epul.service;

import com.epul.persistence.Sport;

import java.util.List;

/**
 * Created by Dimitri on 07/11/2015.
 */
public interface ISportService {
    Sport getSport(int id);
    List<Sport> getAllSport();
}
