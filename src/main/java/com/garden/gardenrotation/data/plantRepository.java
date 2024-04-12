package com.garden.gardenrotation.data;

import com.garden.gardenrotation.models.plant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface plantRepository extends CrudRepository<plant, Integer> {

//TODO: add methods
}
