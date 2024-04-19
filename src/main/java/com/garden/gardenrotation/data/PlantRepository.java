package com.garden.gardenrotation.data;

import com.garden.gardenrotation.models.Plant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends CrudRepository<Plant, Integer> {

//TODO: add methods
}
