package com.garden.gardenrotation.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//repository interface for garden boxes
@Repository
public interface BoxRepository<Box> extends JpaRepository<Box, Integer> {
}
