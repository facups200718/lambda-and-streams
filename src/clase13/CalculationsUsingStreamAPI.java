package clase13;

import java.util.stream.IntStream;

public class CalculationsUsingStreamAPI {
    public static void main(String[] args) {
        //Imprime 340
        System.out.println(IntStream.of(20, 40, 60, 10, 340, 50, 90).max().getAsInt());
        //Imprime 10
        System.out.println(IntStream.of(20, 40, 60, 10, 340, 50, 90).min().getAsInt());
        //Imprime el promedio de los numeros
        System.out.println(IntStream.of(20, 40, 60, 10, 340, 50, 90).average().getAsDouble());
        //Imprime la suma de los numeros
        System.out.println(IntStream.of(20, 40, 60, 10, 340, 50, 90).sum());
    }
}
