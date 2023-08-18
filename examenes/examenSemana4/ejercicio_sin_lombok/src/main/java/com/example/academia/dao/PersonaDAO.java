package com.example.academia.dao;

import java.util.List;

import com.example.academia.entity.Persona;

public interface PersonaDAO {
	
	List<Persona> findAll();
	Persona findById(int id);
	Persona save(Persona persona);
	void deleteById(int id);
	
}
