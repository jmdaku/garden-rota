package com.garden.gardenrotation.controllers;

import com.garden.gardenrotation.data.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
//TODO: add request mapping
public class FamilyController {

    @Autowired
    private FamilyRepository familyRepository;

    //http://localhost:8080/families
    public String displayFamiliesPage(Model model) {
        //TODO: add get mapping

        model.addAttribute("plants", familyRepository.findAll());
        return "families/index";
    }

    //TODO: add methods for adding & deleting plant families



}
