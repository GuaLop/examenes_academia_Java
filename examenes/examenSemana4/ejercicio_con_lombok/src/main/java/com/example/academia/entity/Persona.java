package com.example.academia.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="persona")
public class Persona {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id")
	    private int id;
	 
	 	@Column(name="nombre")
	 	private String nombre;
	 	
	 	@Column(name="apellido")
	 	private String apellido;
	 	
	 	@Column(name="direccion")
	 	private String direccion;
	 	
	 	@Column(name="telefono")
	 	private int telefono;
	 	
	 	
	 	public Persona() {
			
		}

		//Se crea el constructor
		public Persona(String nombre, String apellido, String direccion, int telefono) {	
			this.nombre = nombre;
			this.apellido = apellido;
			this.direccion = direccion;
			this.telefono = telefono;
		}
		
		 // define getter/setter
		
}
