package com.epul.controller;

import com.epul.persistence.Sejour;
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
    private ISejourService sejourService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Sejour> getSejours() {
        return sejourService.getAllSejours();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Sejour getSejour(@PathVariable(value = "id") int id) {
        return sejourService.getSejour(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
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
