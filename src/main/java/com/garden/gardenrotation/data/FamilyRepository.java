package com.garden.gardenrotation.data;

import com.garden.gardenrotation.models.Family;
import org.springframework.data.jpa.repository.JpaRepository;

//repository interface for plant families
public interface FamilyRepository extends JpaRepository<Family, Integer> {
}
