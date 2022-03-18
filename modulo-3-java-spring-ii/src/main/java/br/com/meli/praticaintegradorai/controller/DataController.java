package br.com.meli.praticaintegradorai.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@RestController
public class DataController {

    @GetMapping("/{dia}/{mes}/{ano}")
    public Integer exibeIdade(@PathVariable int dia,
                              @PathVariable int mes,
                              @PathVariable int ano){


        Calendar cal = GregorianCalendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        int Idade = anoAtual - ano;//Calcula a idade apenas com os anos
        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        int mesAtual = cal.get(Calendar.MONTH);
        if(dia >= diaAtual && mes >= mesAtual){
            Idade--;
        }
        return Idade;


    }

}
