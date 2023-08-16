package com.example.academia.entity;

import jakarta.persistence.*;


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
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public int getTelefono() {
			return telefono;
		}

		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}

		@Override
		public String toString() {
			return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
					+ ", telefono=" + telefono + "]";
		}
}
