package com.epul.controller;

import com.epul.persistence.Sejour;
import com.epul.persistence.SejourClient;
import com.epul.service.ISejourClientService;
import com.epul.service.ISejourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Corinne on 25/10/2015.
 *
 * @version 1.0
 */
@RestController
@RequestMapping("/Sejours")
public class SejourController {
    @Autowired
    private ISejourClientService sejourClientService;

    @Autowired
    private ISejourService sejourService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<SejourClient> getSejours() {
        return sejourClientService.getAllSejours();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public SejourClient getSejour(@PathVariable(value = "id") int id) {
        return sejourClientService.getSejour(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteSejour(@PathVariable(value = "id") int id) {
        return sejourService.deleteSejour(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public String addSejour(@RequestBody Sejour sejour) {
        return sejourService.addSejour(sejour);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public String modifySejour(@RequestBody Sejour sejour) {
        return sejourService.modifySejour(sejour);
    }
}
