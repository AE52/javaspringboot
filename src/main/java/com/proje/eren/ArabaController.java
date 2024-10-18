package com.proje.eren;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ArabaController {
    
    
        @GetMapping("/araba")
        public Araba getAraba() {
            return new Araba("Opel", "Astra", 2015);
        }
    }
