package singleton;

public class Main {
    public static void main(String[] args) {

        Estudiante e1 = Estudiante.getInstance();
        Estudiante e2 = Estudiante.getInstance();
        Estudiante e3 = Estudiante.getInstance();
        Estudiante e4 = Estudiante.getInstance();

        /** se obtiene la misma instancia de Estudiante en todo el programa, se debe
         * a que el patrón singleton asegura que solo haya una instancias de la clase en toda
         * la aplicación*/
        System.out.println(Estudiante.getContador()); //1

    }
}
