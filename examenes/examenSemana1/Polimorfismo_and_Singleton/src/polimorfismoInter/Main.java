package polimorfismoInter;

public class Main {

    public static void main (String[] args) {

        /** Se utiliza la referencia de la interfaz "EstacionesAño" para crear los objetos de las clases*/

        EstacionesAño otoño= new Otoño();
        EstacionesAño invierno = new Invierno();
        EstacionesAño primavera = new Primavera();
        EstacionesAño verano = new Verano();

        /** se hace el llamado del método "tipoDeEstacion", debido al polimorfismo, la implementación
         adecuada del metodo se seleccionara en tiempo de ejecución, dependiendo del tipo de
         objeto al que se le haga la referencia.
         */

        otoño.tipoDeEstacion();
        invierno.tipoDeEstacion();

    }

}
