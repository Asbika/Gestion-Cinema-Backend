package com.example.demo;

import com.example.demo.service.IcinemainitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaApplication implements CommandLineRunner {
	@Autowired
	private IcinemainitService icinemainitService;
	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		icinemainitService.initVilles();
		icinemainitService.initCinemas();
		icinemainitService.initSalles();
		icinemainitService.initPlaces();
		icinemainitService.initSeances();
		icinemainitService.initCategoried();
		icinemainitService.initFilms();
		icinemainitService.initProjections();
		icinemainitService.initTickets();
	}
}
