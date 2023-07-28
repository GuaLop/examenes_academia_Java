package com.polimorfismoAbs;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Automovil automovil = new Mazda();
        automovil.setTipoAuto("Mazda");
        System.out.println("El tipo de auto es " + main.getTipoAuto(automovil));
        automovil.automatico();
        System.out.println("  *********  ");
        automovil= new Nissan();
        automovil.setTipoAuto("Nissan");
        System.out.println("El tipo de auto es " + main.getTipoAuto(automovil));
        automovil.estandar();

    }
    String getTipoAuto (Automovil automovil){
        return automovil.getTipoAuto();
    }
}