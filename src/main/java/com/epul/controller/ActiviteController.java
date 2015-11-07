package com.epul.controller;

import com.epul.persistence.Activite;
import com.epul.persistence.ActivitePK;
import com.epul.service.IActiviteService;
import com.epul.service.ISejourService;
import com.epul.service.ISportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dimitri on 07/11/2015.
 */
@RestController
@RequestMapping("/Activites")
public class ActiviteController {
    @Autowired
    private IActiviteService activiteService;

    @Autowired
    private ISportService sportService;

    @Autowired
    private ISejourService sejourService;

    @RequestMapping(value = "/Sejour/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Object> getActivitesById(@PathVariable(value = "id") int id) {
        List<Object> result = new ArrayList<>();
        for (Activite activite : activiteService.getActivitesBySejourId(id)) {
            result.add(Arrays.asList(activite, sportService.getSport(activite.getCodeSport())));
        }
        return result;
    }

    @RequestMapping(value = "/Sejour", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public List<Integer> getSejoursIdByActivite(@RequestBody ActivitePK pk) {
        List<Integer> sejours = new ArrayList<>();
        for (Activite activite : activiteService.getActivitesByCodeSportAndDateJour(pk.getNumSej(), pk.getDateJour())) {
            sejours.add(sejourService.getSejour(activite.getNumSej()).getNumSej());
        }
        return sejours;
    }
}
