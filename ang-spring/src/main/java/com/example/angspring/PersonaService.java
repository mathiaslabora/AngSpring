package com.example.angspring;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonaService {

    List<Persona>listar();
    Persona listarId(int id);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id);

}
