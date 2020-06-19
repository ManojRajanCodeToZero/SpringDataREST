package com.example.SpringDataRest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.SpringDataRest.model.Engineer;

@RepositoryRestResource(collectionResourceRel = "engineers", path = "engineers")
public interface EngineerRepo extends JpaRepository<Engineer, Integer> {

}
