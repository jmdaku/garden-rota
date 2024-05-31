package com.garden.gardenrotation.data;

import com.garden.gardenrotation.models.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//repository interface for garden boxes
@Repository
public interface BoxRepository extends JpaRepository<Box, Integer> {
}
