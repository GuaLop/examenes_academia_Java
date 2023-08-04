

public class Main {

    public static void main(String[] args) {

        try {
            // Código que puede lanzar diferentes excepciones
            String input = "123abc";
            int number = parseInteger(input);
            System.out.println("Número: " + number);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            // Manejo de excepciones usando el multicatch
            System.out.println("Se ha producido una excepción: " + e);
        }
    }

    public static int parseInteger(String input) {
        // Intentamos convertir el input a un número entero
        return Integer.parseInt(input);
    }
}

