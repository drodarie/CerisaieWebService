package com.epul.controller;

import com.epul.persistence.ActivitePK;
import com.epul.persistence.ActiviteSport;
import com.epul.service.IActiviteService;
import com.epul.service.IActiviteSportService;
import com.epul.service.ISejourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Dimitri on 07/11/2015.
 */
@RestController
@RequestMapping("/Activites")
public class ActiviteController {
    @Autowired
    private IActiviteService activiteService;

    @Autowired
    private ISejourService sejourService;

    @Autowired
    private IActiviteSportService activiteSportService;

    @RequestMapping(value = "/Sejour/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<ActiviteSport> getActivitesById(@PathVariable(value = "id") int id) {
        return activiteSportService.getActivitesBySejourId(id);
    }

    @RequestMapping(value = "/Sejour", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public List<Integer> getSejoursIdByActivite(@RequestBody ActivitePK pk) {
        return activiteService.getActivitesByCodeSportAndDateJour(pk.getNumSej(), pk.getDateJour()).stream()
                .map(activite -> sejourService.getSejour(activite.getNumSej()).getNumSej())
                .collect(Collectors.toList());
    }
}
