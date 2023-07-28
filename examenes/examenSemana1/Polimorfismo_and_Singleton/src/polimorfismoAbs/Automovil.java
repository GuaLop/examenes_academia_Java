package com.polimorfismoAbs;

/** Se crea la clase abstracta "Automovil"*/
public abstract class Automovil {

    /** se crea un atributo con private para que solo la misma clase
      pueda tener acceso */
    private String tipoAuto;

    /** se crean 2 métodos abstractos, por lo que no deben tener comportamientos
      y como la clase es abstracta también a los métodos se le debe poner*/
    abstract void estandar();
    abstract void automatico();

    /** se crea sus métodos seters y getters y estos si tienen comportamientos,
      porqué por medio de ello tenemos acceso al atributo "tipoAuto"
     */
    public String getTipoAuto() {
        return tipoAuto;
    }
    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

}
