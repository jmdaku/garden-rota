package com.garden.gardenrotation.services;

import com.garden.gardenrotation.data.BoxRepository;
import com.garden.gardenrotation.models.Box;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BoxService {

    private final BoxRepository boxRepository;

    //constructor
    @Autowired
    public BoxService(BoxRepository boxRepository) {this.boxRepository = boxRepository;}

    //save a box
    public Box saveBox(Box box) {return (Box) boxRepository.save(box);}

    //return a list of all boxes
    public List<Box> getAllBoxes() {return boxRepository.findAll();}

    //return one box
    public Optional<Box> getBoxById(int id) {return boxRepository.findById(id);}

    //update a box
    public Box updateBox(int id, Box updatedBox) {
        Optional<Box> existingBox = boxRepository.findById(id);
        if (existingBox.isPresent()) {
            Box box = existingBox.get();
            box.setLocation(updatedBox.getLocation());
            box.setYear(updatedBox.getYear());
            return (Box) boxRepository.save(box);
        } else {
            throw new RuntimeException("Box not found");
        }
    }

    //delete a box
    public void deleteBox(int id) {
        boxRepository.deleteById(id);
    }

}

