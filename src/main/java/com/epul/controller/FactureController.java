package com.epul.controller;

import com.epul.persistence.Facture;
import com.epul.service.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Laura on 10/01/2016.
 */
@RestController
@RequestMapping("/Facture")
public class FactureController {
    @Autowired
    private IFactureService factureService;

    @RequestMapping(value = "/{numSej}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Facture getSejours(@PathVariable(value = "numSej")int numSej) {
        return factureService.getFactureForSejour(numSej);
    }

}
