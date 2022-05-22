package clase9;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFindAPI {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(30, 50, 70, 90, 110);
        //Imprime el 30
        integerList.stream().findFirst().ifPresent(System.out::println);

        //Imprime un false, ya que ningun numero de la lista cumple con esa condicion
        System.out.println(integerList.stream().anyMatch(n -> (n * (n + 1) / 4 == 5)));

        //Imprime un true, ya que todos los numeros de la lista cumplen con esa condicion
        System.out.println(integerList.stream().allMatch(n -> n % 2 == 0));

        //Imprime un true, ya que ninguno de los numeros de la lista cumple con la condicion
        System.out.println(integerList.stream().noneMatch(n -> n < 0));

        //Cada vez devuelve cualquier numero que cumpla la condicion, por ejemplo 51
        IntStream intStream = IntStream.of(42, 51, 82, 10, 14, 18).parallel();
        intStream.filter(n -> n % 3 == 0).findAny().ifPresent(System.out::println);
    }
}
