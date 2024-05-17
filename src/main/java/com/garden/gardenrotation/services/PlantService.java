package com.garden.gardenrotation.services;

import com.garden.gardenrotation.data.PlantRepository;
import com.garden.gardenrotation.models.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

//service class for managing plants

@Service
public class PlantService {

    private final PlantRepository plantRepository;

    //constructor
    @Autowired
    public PlantService(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    //save a plant
    public Plant savePlant(Plant plant) {
        return plantRepository.save(plant);
    }

    //return a list of all plants
    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }

    //return one plant
    public Optional<Plant> getPlantById(int id) {
        return plantRepository.findById(id);
    }

    //update a plant
    public Plant updatePlant(int id, Plant updatedPlant) {
        Optional<Plant> existingPlant = plantRepository.findById(id);
        if (existingPlant.isPresent()) {
            Plant plant = existingPlant.get();
            plant.setName(updatedPlant.getName());
            plant.setFamily(updatedPlant.getFamily());
            plant.setPerennial(updatedPlant.isPerennial());
            return plantRepository.save(plant);
        } else {
            throw new RuntimeException("Plant not found");
        }
    }

    //delete a plant
    public void deletePlant(int id) {
        plantRepository.deleteById(id);
    }

}
