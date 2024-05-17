package com.garden.gardenrotation.services;

import com.garden.gardenrotation.data.FamilyRepository;
import com.garden.gardenrotation.models.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FamilyService {

    private final FamilyRepository familyRepository;

    //constructor
    @Autowired
    public FamilyService(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }

    //save a family
    public Family saveFamily(Family family) {
        return familyRepository.save(family);
    }

    //return a list of all families
    public List<Family> getAllFamilies() {
        return familyRepository.findAll();
    }

    //return one family
    public Optional<Family> getFamilyById(int id) {
        return familyRepository.findById(id);
    }

    //update a family
    public Family updateFamily(int id, Family updatedFamily) {
        Optional<Family> existingFamily = familyRepository.findById(id);
        if (existingFamily.isPresent()) {
            Family family = existingFamily.get();
            family.setName(updatedFamily.getName());
            return familyRepository.save(family);
        } else {
            throw new RuntimeException("Family not found");
        }
    }

    //delete a family
    public void deleteFamily(int id) {
        familyRepository.deleteById(id);
    }
    
}
