package polimorfismoInter;

/**se implementa la interfaz "EstacionesAño" a la clase "Otoño"*/
public class Otoño implements EstacionesAño {

    /**se hace un @Override al método de la interfaz  para asignarle un comportamiento y se le
     coloca public porque todos los métodos creados en una interfaz son public, por lo que cuando
     se implementa el hijo debe tener la palabra reservada*/
    @Override
    public void tipoDeEstacion() {
        System.out.println("Es Otoño y las hojas cambian de color");
    }
}
