package com.dnapass.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dnapass.training.entity.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet,Long>{

}
