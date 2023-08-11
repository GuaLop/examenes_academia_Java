package org.example;

import java.util.Objects;

public class Alumno {
    private Integer id;
    private String name;

    public Alumno(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //para que dos objetos sean iguales utilizando 'asserEquals' se debe sobreescribir
    //el método equals porque si no solo estaria comparando la direccion en memoria.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(id, alumno.id) && Objects.equals(name, alumno.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
