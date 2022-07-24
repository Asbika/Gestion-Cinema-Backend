package com.example.demo.dao;

import com.example.demo.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource

public interface CinemaRepository extends JpaRepository<Cinema,Long> {
}
