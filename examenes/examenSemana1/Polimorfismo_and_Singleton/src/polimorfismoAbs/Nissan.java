package com.polimorfismoAbs;

/** se  crea una clase que herada de Automovil*/
public class Nissan extends Automovil {

/** se hace @Override a los métodos de la clase padre para asignarle un comportamiento*/
    @Override
    void estandar () {
        System.out.println("  El auto es estandar");

    };
    @Override
    void automatico () {
        System.out.println("  El auto es automatico");
    };
}
