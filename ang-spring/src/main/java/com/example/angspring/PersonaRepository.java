package com.example.angspring;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PersonaRepository extends JpaRepository<Persona, Integer> {
List<Persona> findAll();
Persona findById(int id);
Persona save(Persona p);
void delete(Persona p);

}
