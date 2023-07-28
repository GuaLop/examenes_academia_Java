package singleton;

/**se crea la clase que representará al Estudiante con objetos únicos*/
public class Estudiante {

    /**se crea la instancia static private de la clase*/
    private static Estudiante est;
    String nombreDirector;
    static int contador;

    /**se crea el constructor con private para evitar la creación de nuevas instancias*/
    private Estudiante(String nombre){
        this.nombreDirector = nombre;
        contador++;
    };

    public static int getContador(){
        return contador;
    }

    /**se crea el método static que se encargara de controlar
     * el acceso a la instancia "Estudiante"
     */
    public static Estudiante getInstance (){
        if (est == null) {
            est = new Estudiante("Director: Javier Velázquez");
        }
        return est;
    }

}
