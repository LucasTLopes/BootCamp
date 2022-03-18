package br.com.meli.praticaintegradoraii.praticaintegradoraii.controller;


import br.com.meli.praticaintegradoraii.praticaintegradoraii.entity.Sport;
import br.com.meli.praticaintegradoraii.praticaintegradoraii.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SportController {

    private SportService sportService;

    @Autowired
    public SportController() {
        this.sportService = new SportService();
    }


}
