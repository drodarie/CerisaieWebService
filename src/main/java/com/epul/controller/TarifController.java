package com.epul.controller;

import com.epul.persistence.Sejour;
import com.epul.service.*;
import com.epul.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dimitri on 18/11/2015.
 */
@RestController
public class TarifController {
    @Autowired
    private ISejourService sejourService;

    @Autowired
    private IActiviteService activiteService;

    @Autowired
    private ISportService sportService;

    @Autowired
    private IEmplacementService emplacementService;

    @Autowired
    private ITypeEmplacementService typeEmplacementService;


    @RequestMapping(value = "Sejours/{id}/Tarif", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Object> getSejourPrice(@PathVariable(value = "id") int id) {
        List<Object> result = new ArrayList<>();
        Sejour sejour = sejourService.getSejour(id);
        result.add(Arrays.asList(sejour, (TimeUtils.getDayFromTime(sejour.getDateFinSej()) - TimeUtils.getDayFromTime(sejour.getDatedebSej())) * typeEmplacementService
                .getTypeEmplacement(emplacementService
                        .getEmplacement(sejour.getNumEmpl()).getCodeTypeE())
                .getTariftypepl() +
                activiteService.getActivitesBySejourId(id).parallelStream()
                        .mapToInt(activite -> sportService.getSport(activite.getCodeSport()).getTarifUnite()).sum()));
        return result;
    }

    @RequestMapping(value = "Sejours/{id}/TarifActivites", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Object> getSejourActivitePrice(@PathVariable(value = "id") int id) {
        List<Object> result = new ArrayList<>();
        Sejour sejour = sejourService.getSejour(id);
        result.add(Arrays.asList(sejour, activiteService.getActivitesBySejourId(id).parallelStream()
                .mapToInt(activite -> sportService.getSport(activite.getCodeSport()).getTarifUnite()).sum()));
        return result;
    }
}
