package br.com.meli.projectmevam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Converter {

    @GetMapping("/converter")
    @ResponseBody
    public String testandoSpring(@RequestParam Integer decimal){
        int[] vaNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] vaRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String decimalToRomano = "";
        while (true) {

            int numero = decimal;
            if (numero == 0) break;
            int i = 0;
            while (numero > 0) {
                if (numero >= vaNum[i]) {
                    decimalToRomano += vaRom[i];
                    numero -= vaNum[i];
                } else {
                    i++;
                }
            }
            break;
        }
        return decimalToRomano;
    }

}
