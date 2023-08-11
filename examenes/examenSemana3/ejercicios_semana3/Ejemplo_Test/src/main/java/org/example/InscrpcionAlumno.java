package org.example;


import java.util.HashMap;

public class InscrpcionAlumno {
   private final HashMap<Integer, Alumno> alumnos = new HashMap<>();

    public Alumno inscribirAlumno(Integer id, String name){
       alumnos.put(id, new Alumno(id, name));
       return alumnos.get(id);
    }
    public Alumno obtenerAlumno (Integer id){
        return alumnos.get(id);
    }
    public Alumno agregarAlumno (Integer id, String name){
        return alumnos.put(id, new Alumno(id, name));
    }

}
