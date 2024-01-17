package com.example.angspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
        //,maxAge = 3600)
@RequestMapping({"/personas"})
public class Controlador {

    @Autowired
    PersonaService service;

    @GetMapping
    public List<Persona>listar(){
     return service.listar();
    }
}
