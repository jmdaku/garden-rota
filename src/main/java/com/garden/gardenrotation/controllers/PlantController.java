package com.garden.gardenrotation.controllers;

import com.garden.gardenrotation.models.Plant;
import com.garden.gardenrotation.services.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/plants")
public class PlantController {

    private PlantService plantService;
    
    @Autowired
    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    //display all plants 
    //http://localhost:8080/plants/index
    @GetMapping
    public String displayPlantsPage(Model model) {
        List<Plant> plants = plantService.getAllPlants();
        model.addAttribute("plants", plants);
        
        return "plants/index";
    }

    //display form to add a new plant
    //http://localhost:8080/plants/add
    @GetMapping("/add")
    public String displayAddPlantForm(Model model) {
        model.addAttribute("plant", new Plant());
        return "plants/add";
    }

    //submit new plant form
    @PostMapping("/add")
    public String addPlant(@ModelAttribute("plant") Plant plant) {
        plantService.savePlant(plant);
        return "redirect:/plants";
    }

    //display form to edit a plant
    //http://localhost:8080/plants/edit
    @GetMapping("/edit/{id}")
    public String displayEditPlantForm(@PathVariable int id, Model model) {
        Optional<Plant> plant = plantService.getPlantById(id);
        if (plant.isPresent()) {
            model.addAttribute("plant", plant.get());
            return "plants/edit";
        } else {
            // Handle plant not found
            return "redirect:/plants";
        }
    }

    //submit edit plant form
    @PostMapping("/edit/{id}")
    public String updatePlant(@PathVariable int id, @ModelAttribute("plant") Plant updatedPlant) {
        plantService.updatePlant(id, updatedPlant);
        return "redirect:/plants";
    }

    //delete a plant
    @GetMapping("/delete/{id}")
    public String deletePlant(@PathVariable int id) {
        plantService.deletePlant(id);
        return "redirect:/plants";
    }

}
