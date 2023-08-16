package com.example.academia.service;

import java.util.List;

import com.example.academia.entity.Persona;

public interface PersonaService {
	List<Persona> findAll();
	Persona findById(int id);
	Persona save(Persona persona);
	void deleteById(int id);

}
