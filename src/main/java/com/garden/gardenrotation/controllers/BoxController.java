package com.garden.gardenrotation.controllers;

import com.garden.gardenrotation.models.Box;
import com.garden.gardenrotation.services.BoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/boxes")
public class BoxController {

    private final BoxService boxService;

    @Autowired
    public BoxController(BoxService boxService) {
        this.boxService = boxService;
    }

    //display all boxes
    //http://localhost:8080/boxes/index
    @GetMapping
    public String displayBoxesPage(Model model) {
        List<Box> boxes = boxService.getAllBoxes();
        model.addAttribute("boxes", boxes);
        return "boxes/index";
    }

    //display form to add a new box
    //http://localhost:8080/boxes/add
    @GetMapping("/add")
    public String displayAddBoxForm(Model model) {
        model.addAttribute("box", new Box());
        return "boxes/add";
    }

    //submit new box form
    @PostMapping("/add")
    public String addBox(@ModelAttribute("box") Box box) {
        boxService.saveBox(box);
        return "redirect:/boxes";
    }

    //display form to edit a box
    //http://localhost:8080/boxes/edit
    @GetMapping("/edit/{id}")
    public String displayEditBoxForm(@PathVariable int id, Model model) {
        Optional<Box> box = boxService.getBoxById(id);
        if (box.isPresent()) {
            model.addAttribute("box", box.get());
            return "boxes/edit";
        } else {
            // Handle box not found
            return "redirect:/boxes";
        }
    }

    //submit edit box form
    @PostMapping("/edit/{id}")
    public String updateBox(@PathVariable int id, @ModelAttribute("box") Box updatedBox) {
        boxService.updateBox(id, updatedBox);
        return "redirect:/boxes";
    }

    //delete a box
    @GetMapping("/delete/{id}")
    public String deleteBox(@PathVariable int id) {
        boxService.deleteBox(id);
        return "redirect:/boxes";
    }

}
