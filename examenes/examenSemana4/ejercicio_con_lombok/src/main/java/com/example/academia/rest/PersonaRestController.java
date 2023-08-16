package com.example.academia.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.academia.entity.Persona;
import com.example.academia.service.PersonaService;


@RestController
@RequestMapping("/api")
public class PersonaRestController {
	
	private PersonaService personaService;
	
	@Autowired
	public PersonaRestController (PersonaService personaServ) {
		personaService = personaServ;
		
	}
	
	 // return a list of personas
	@GetMapping("/personas")
	public List<Persona> findAll() {
		return personaService.findAll();		
	}
	
	 // add mapping for GET /persona/{personaId}
	@GetMapping("/personas/{personaId}")
	public Persona getPersonaId (@PathVariable int personaId) {
		Persona p = personaService.findById(personaId);
		 if (p == null) {
	            throw new RuntimeException("Persona id not found - " + personaId);
	        }

	        return p;
	    }
	
	  // add mapping for POST /personas - add new persona
	@PostMapping("/personas")
	public Persona posPersona (@RequestBody Persona pe) {
		
		  // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update
		pe.setId(0);

        Persona dbPersona = personaService.save(pe);

        return dbPersona;
		
	}
	
	 // add mapping for PUT /personas - add new persona
		@PutMapping("/personas")
		public Persona putPersona (@RequestBody Persona pe) {
			Persona dbPersona = personaService.save(pe);

	        return dbPersona;
		}
		
		 // add mapping for DELETE /personas/{personaId} - delete persona
		@DeleteMapping("/personas/{personaId}")
	    public String deletePersona(@PathVariable int personaId) {

	        Persona tempPersona = personaService.findById(personaId);

	        // throw exception if null

	        if (tempPersona == null) {
	            throw new RuntimeException("Persona id not found - " + personaId);
	        }

	        personaService.deleteById(personaId);

	        return "Deleted persona id - " + personaId;
	    }
		
	}


