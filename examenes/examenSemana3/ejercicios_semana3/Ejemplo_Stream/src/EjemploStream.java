import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

enum Sexo {M, F};

public class EjemploStream {
    public static void main(String[] args) {
        Persona p1 = new Persona(2,5,Sexo.F);
        Persona p2 = new Persona(5,15,Sexo.M);
        Persona p3 = new Persona(3,10,Sexo.M);
        Persona p4 = new Persona(4,10,Sexo.F);
        Persona p5 = new Persona(1,5,Sexo.M);

        List<Persona> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        List<Integer> listaEnteros = list.stream()
                .filter(p -> p.getType().equals(Sexo.M)) //Filtrado de sexo musculino = 3
                .filter(p -> p.getEdad()<=10 ) //FIltrado por edad menor o igual a 10 = 2
                .sorted(Comparator.comparing(Persona::getId)) // se ordena por id de menor a mayor
                .map(Persona::getId) // se hace un map por id y se recibe un tipo Integer
                .collect(Collectors.toList()); // se obtiene una lista de enteros
                System.out.println(listaEnteros);
    }
}