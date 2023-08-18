package com.example.academia.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.academia.entity.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class PersonaDAOImple implements PersonaDAO {
	
	  // define field for entitymanager
    private EntityManager entityManager;


    // set up constructor injection
    @Autowired
    public PersonaDAOImple(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


	@Override
	public List<Persona> findAll() {
		 // create a query
        TypedQuery<Persona> theQuery = entityManager.createQuery("from Persona", Persona.class);

        // execute query and get result list
        List<Persona> personas = theQuery.getResultList();
        
        // return the results
		return personas;
	}
	
	@Override
	public Persona findById(int id) {
		 // get persona
        Persona persona = entityManager.find(Persona.class, id);
       
        // return persona
		return persona;
	}

	@Override
	public Persona save(Persona persona) {
		 // save and update persona
        Persona dbPersona = entityManager.merge(persona);
        
		return dbPersona;
	}

	@Override
	public void deleteById(int id) {
		
		 // find persona by id
		Persona deletePersona = entityManager.find(Persona.class, id);
		
		//remove persona
		entityManager.remove(deletePersona);
		
	}

}
