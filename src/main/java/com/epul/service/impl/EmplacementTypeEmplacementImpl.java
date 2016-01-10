package com.epul.service.impl;

import com.epul.dao.IEmplacementDAO;
import com.epul.persistence.Emplacement;
import com.epul.persistence.EmplacementTypeEmplacement;
import com.epul.persistence.TypeEmplacement;
import com.epul.service.IEmplacementEmplacementTypeService;
import com.epul.service.IEmplacementService;
import com.epul.service.ITypeEmplacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Laura on 10/01/2016.
 */
@Service
public class EmplacementTypeEmplacementImpl implements IEmplacementEmplacementTypeService {
    @Autowired
    private IEmplacementDAO emplacementDAO;
    @Autowired
    private ITypeEmplacementService typeEmplacementService;

    @Override
    public ArrayList<EmplacementTypeEmplacement> getAllEmplacement() {
        ArrayList<EmplacementTypeEmplacement> result = new ArrayList<EmplacementTypeEmplacement>();
        List<Emplacement> emplacements = emplacementDAO.findAll();
        TypeEmplacement typeEmplacement = new TypeEmplacement();
        for (int i =0; i<emplacements.size();i++){
            EmplacementTypeEmplacement empl = new EmplacementTypeEmplacement();
            empl.setNbPersMaxEmpl(emplacements.get(i).getNbPersMaxEmpl());
            empl.setNumEmpl(emplacements.get(i).getNumEmpl());
            empl.setCodeTypeE(emplacements.get(i).getCodeTypeE());
            empl.setSurfaceEmpl(emplacements.get(i).getSurfaceEmpl());
            typeEmplacement = typeEmplacementService.getTypeEmplacement(empl.getCodeTypeE());
            empl.setLibtypepl(typeEmplacement.getLibtypepl());
            empl.setTariftypepl(typeEmplacement.getTariftypepl());
            result.add(empl);
        }
        return result;
    }
}
