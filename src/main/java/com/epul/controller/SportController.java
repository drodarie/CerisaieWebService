package com.epul.controller;

import com.epul.persistence.Sport;
import com.epul.service.ISportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Laura on 10/01/2016.
 */
@RestController
@RequestMapping("/Sport")
public class SportController {
    @Autowired
    private ISportService sportService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Sport> getAllSport(){
        return  sportService.getAllSport();
    }

}
