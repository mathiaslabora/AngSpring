package com.example.angspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImp implements PersonaService {
    @Autowired
    private PersonaRepository repositorio;

    @Override
    public List<Persona> listar() {
        return repositorio.findAll();
    }

    @Override
    public Persona listarId(int id) {
        return null;
    }

    @Override
    public Persona add(Persona p) {
        return null;
    }

    @Override
    public Persona edit(Persona p) {
        return null;
    }

    @Override
    public Persona delete(int id) {
        return null;
    }

}
