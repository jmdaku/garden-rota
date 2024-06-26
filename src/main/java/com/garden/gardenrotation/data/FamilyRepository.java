package com.garden.gardenrotation.data;

import com.garden.gardenrotation.models.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//repository interface for plant families
@Repository
public interface FamilyRepository extends JpaRepository<Family, Integer> {
}
