package br.com.meli.praticaintegradoraii.controller;

import br.com.meli.praticaintegradoraii.model.MorseCode;
import br.com.meli.praticaintegradoraii.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConverterController {


    @Autowired
    ConverterService converterService = new ConverterService();

    @PostMapping("/converter")
    @ResponseStatus(HttpStatus.CREATED)
    public MorseCode converter(@RequestBody String morseCode) {
        MorseCode morse = new MorseCode(morseCode);
        return converterService.convertMorseCode(morse);

    }
}
