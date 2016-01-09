package com.epul.service;

import com.epul.persistence.ActiviteSport;

import java.util.List;

/**
 * @Author Dimitri on 09/01/2016.
 * @Version 1.0
 */
public interface IActiviteSportService {
    List<ActiviteSport> getActivitesBySejourId(int id);
}
