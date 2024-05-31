package com.garden.gardenrotation.controllers;

import com.garden.gardenrotation.models.Family;
import com.garden.gardenrotation.models.Family;
import com.garden.gardenrotation.services.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/families")
public class FamilyController {

    private final FamilyService familyService;

    @Autowired
    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    //display all plant families
    //http://localhost:8080/families/index
    @GetMapping
    public String displayFamiliesPage(Model model) {
        List<Family> families = familyService.getAllFamilies();
        model.addAttribute("families", families);
                return "families/index";
    }

    //display form to add a new plant family
    //http://localhost:8080/families/add
    @GetMapping("/add")
    public String displayAddFamilyForm(Model model) {
        model.addAttribute("family", new Family());
        return "families/add";
    }

    //submit new plant family form
    @PostMapping("/add")
    public String addFamily(@ModelAttribute("family") Family family) {
        familyService.saveFamily(family);
        return "redirect:/families";
    }

    //display form to edit a family
    //http://localhost:8080/families/edit
    @GetMapping("/edit/{id}")
    public String displayEditFamilyForm(@PathVariable int id, Model model) {
        Optional<Family> family = familyService.getFamilyById(id);
        if (family.isPresent()) {
            model.addAttribute("family", family.get());
            return "families/edit";
        } else {
            // Handle family not found
            return "redirect:/families";
        }
    }

    //submit edit family form
    @PostMapping("/edit/{id}")
    public String updateFamily(@PathVariable int id, @ModelAttribute("family") Family updatedFamily) {
        familyService.updateFamily(id, updatedFamily);
        return "redirect:/families";
    }

    //delete a family
    @GetMapping("/delete/{id}")
    public String deleteFamily(@PathVariable int id) {
        familyService.deleteFamily(id);
        return "redirect:/families";
    }

}
