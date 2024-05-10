package com.garden.gardenrotation.data;

import com.garden.gardenrotation.models.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//repository interface for plants
@Repository
public interface PlantRepository extends JpaRepository<Plant, Integer> {

//TODO: add methods
}
