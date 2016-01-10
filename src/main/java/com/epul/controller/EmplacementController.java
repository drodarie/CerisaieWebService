package com.epul.controller;

import com.epul.persistence.EmplacementTypeEmplacement;
import com.epul.service.IEmplacementEmplacementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by Laura on 10/01/2016.
 */
@RestController
@RequestMapping("/Emplacement")
public class EmplacementController {
    @Autowired
    private IEmplacementEmplacementTypeService emplacementEmplacementTypeService;

    @RequestMapping( method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<EmplacementTypeEmplacement> getAllEmplacements(){
        return emplacementEmplacementTypeService.getAllEmplacement();
    }
}
