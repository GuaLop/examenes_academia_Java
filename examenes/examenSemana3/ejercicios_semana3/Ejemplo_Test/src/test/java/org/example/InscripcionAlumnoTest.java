package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionAlumnoTest {
    private InscrpcionAlumno inscrpcionAlumno;
    @BeforeEach
    public void setUp(){
        inscrpcionAlumno = new InscrpcionAlumno();

    }

    @Test
    @DisplayName("Cuando llamamos a inscribirAlumno" +
            "esperamos que el alumno este creado y estos sean iguales")
    void test1 (){
        Alumno esperado = new Alumno(5, "Juan");
        Alumno alumno = inscrpcionAlumno.inscribirAlumno(5,"Juan");
        assertEquals(esperado.getId(), alumno.getId());
        assertEquals(esperado.getName(), alumno.getName());
        assertEquals(esperado, alumno);

    }
    @Test
    @DisplayName("Cuando llamamos a inscribirAlumno" +
            "esperamos que el alumno este creado y estos no sean iguales")
    void test2 (){
        Alumno esperado = new Alumno(5, "Juan");
        Alumno alumno = inscrpcionAlumno.inscribirAlumno(5,"Pedro");
        assertEquals(esperado.getId(), alumno.getId());
        assertNotEquals(esperado.getName(), alumno.getName());
        assertNotEquals(esperado, alumno);

    }
    @Test
    @DisplayName("Se verifica si un usario no existe, esperando que sea nulo, porque no se ha creado ")
    void test3 (){
        Alumno alumno = inscrpcionAlumno.obtenerAlumno(5);
        assertEquals(null, alumno);

    }
}