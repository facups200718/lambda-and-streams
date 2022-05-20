
import java.util.*;
import java.util.function.Predicate;

public class FunctionPackageSample {
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("alan", "cody", "alex", "blackwell");
        //El Predicate almacena una evaluacion de una condicion para un tipo especifico
        Predicate<String> predicate = (s) -> s.startsWith("a");
        for (String employeeName : employeeNames) {
            //Si el valor que testeamos con el predicado cumple la condicion, se muestra en pantalla
            if (predicate.test(employeeName))
                System.out.println(employeeName);
        }
    }
}
