package com.example.academia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.academia.dao.PersonaDAO;
import com.example.academia.entity.Persona;

@Service
public class PersonaServiceImple implements PersonaService {
	
	private PersonaDAO personaDAO;
	
	@Autowired
	public PersonaServiceImple(PersonaDAO persona) {
		personaDAO = persona;
	}

	@Override
	public List<Persona> findAll() {		
		return personaDAO.findAll();
	}

	@Override
	public Persona findById(int id) {
		return personaDAO.findById(id);
	}
	
	@Transactional
	@Override
	public Persona save(Persona persona) {
		return personaDAO.save(persona);
	}
	
	@Transactional
	@Override
	public void deleteById(int id) {
		personaDAO.deleteById(id);
		
		
	}
	

}
