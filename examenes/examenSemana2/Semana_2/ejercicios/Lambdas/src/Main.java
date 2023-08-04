import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("** Lambda Consumer **");
        /**se crea una lista de nombres y por medio del foreach va suludando a cada uno de ellos*/
        List<String> name = Arrays.asList("Juan", "Pedro","Marcos");
        //Definición y Ejecutar Lambda
        name.forEach(n -> System.out.println("Hola " + n ));

        System.out.println("** Lambda BiConsumer **");
        /**se pasa un string y un integer, es un void y solo los concatenos */
        //Definición
        BiConsumer<String, Integer> datos = (s, i) -> System.out.println("Se llama " + s + " y tiene " + i + " años de edad");
        //Ejecutar
        datos.accept("Juan", 18);

        System.out.println("** Lambda Predicate **");
        /**se pasa un arreglo  y evaluara si la longitud  del arreglo es mayor a 5*/
        Integer [] numbers = {1, 5, 10, 15, 20, 25};
        //Definición
        Predicate<Integer []> num = n -> n.length  > 5;
        //Ejecutar
        System.out.println(num.test(numbers));

        System.out.println("** Lambda Bipredicate **");
        /**recibe un string y un integer y evaluara si la longitud de estos dos valores son iguales(si son iguales retorna true si no false*/
        //Definición
        BiPredicate<String, Integer> nameIguales = (x, y) -> x.length()  == y;
        System.out.println(nameIguales.test("Juan", 5));

        System.out.println("** Lambda Supplier **");
        /**esta lambda no tiene parametros y solo retorna un double, que se le pasa un numero ramdom y lo multiplica por 10*/
        //Definición
        Supplier<Double> sup = () -> Math.random()*10;
        //Ejecutar
        System.out.println(sup.get());

        System.out.println("** Lambda Consumer **");
        //Definición
        Consumer<Double> c2 = c -> System.out.println(c);
        //Ejecuta
        c2.accept(23.34);

        System.out.println("** Lambda Function **");
        /**recibe un string y retorna un entero, se evalua la longitud del string y retorna el numero entero*/
        //Definición
        Function<String, Integer> concatenar = (conc) -> conc.length();
        //Ejecuta
        System.out.println(concatenar.apply("mundo"));

        System.out.println("** Lambda Function **");
        /**recibe un double y retorna un double, es decir se le pasa un numero ramdom y se multiplica por el double que se le pasa*/
        //Definición
        Function<Double, Double> numDouble = (d) -> Math.random()*d;
        //Ejecuta
        System.out.println(numDouble.apply(23.4));

        System.out.println("** Lambda Predicate **");
        /**recibe un string y retorna falso si el string que se le pasa no contiene una 's' y true si la contiene*/
        //Definicion
        Predicate<String> p1 = p -> p.contains("s");
        System.out.println(p1.test("sapo"));

    }
}