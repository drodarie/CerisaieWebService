package com.epul.controller;

import com.epul.persistence.Activite;
import com.epul.service.IActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Dimitri on 07/11/2015.
 */
@RestController
@RequestMapping("/Activites")
public class ActiviteController {
    @Autowired
    private IActiviteService activiteService;

    @RequestMapping(value = "/Sejour/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Activite> getActivitesById(@PathVariable(value = "id") int id) {
        return activiteService.getActivitesBySejourId(id);
    }
}
