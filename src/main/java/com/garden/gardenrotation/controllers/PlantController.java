package com.garden.gardenrotation.controllers;

import com.garden.gardenrotation.data.FamilyRepository;
import com.garden.gardenrotation.data.PlantRepository;
import com.garden.gardenrotation.models.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.Optional;

@Controller
//TODO: add request mapping
public class PlantController {

    @Autowired
    private PlantRepository plantRepository;

    @Autowired
    private FamilyRepository familyRepository;

    //http://localhost:8080/plants
    public String displayPlantsPage(Integer familyId, Model model) {
        //TODO: add get mapping

        if (familyId != null) {
            Optional<Family> result = familyRepository.findById(familyId);
            if (result.isPresent()) {
                Family family = result.get();
                //model.addAttribute("plants", family.getPlants());
                //TODO: fix family.getPlants() then enable
            } else {
                model.addAttribute("plants", plantRepository.findAll());
            }
        }
        return "plants/index";
    }

    //TODO: add methods for adding & deleting plants






}
