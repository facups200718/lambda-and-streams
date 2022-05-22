package clase5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConsumerInterfaceExample {
    public static void main(String[] args) {
        //Recibe un parametro, pero no devuelve nada, es como una funcion que retorna void
        Consumer<String> consumer = ConsumerInterfaceExample::displayEmployeeName;
        consumer.accept("cody");
        consumer.accept("blackwell");
        consumer.accept("alex");
        
        List<String> employeeNames = Arrays.asList("alan", "cody", "alex", "blackwell");
        employeeNames.stream().forEach(employeeName -> {
            displayEmployeeName2(() -> employeeName);
        });

        //Le asignamos a una variable una funcion que recibe un parametro de un tipo y responde con otro
        // del tipo que quieras, sencillo
        Function<Integer, Double> functionTest = testData -> testData / 2d;
        System.out.println(functionTest.apply(100));
    }

    private static void displayEmployeeName2(Supplier<String> employeeNameSupplier) {
        System.out.println(employeeNameSupplier.get());
    }

    private static void displayEmployeeName(String employeeName) {
        System.out.println(employeeName);
    }
}
