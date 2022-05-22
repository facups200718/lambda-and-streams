package clase8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsMapping {
    static List<Employee> employeeList = Arrays.asList(
            new Employee("Gina", 45),
            new Employee("cody", 25),
            new Employee("alex", 65),
            new Employee("blackwell", 15)
    );

    public static void main(String[] args) {
        //Creamos una lista a partir de los nombres de los empleados
        //Usar el stream nos ahorra tener que armar un for each,
        //algo que consumiría mucha CPU y RAM si son muchos employees
        List<String> mappedList = employeeList.stream()
                //El map obtiene datos del stream segun una condicion que le pasamos
                .map(employee -> employee.getName())
                //Agarramos esos datos y con collect lo convertimos en una coleccion
                //El tipo de la coleccion se indica por parametros, en este caso una lista
                .collect(Collectors.toList());
        mappedList.forEach(System.out::println);

        System.out.println();
        List<String> nameCharList = employeeList.stream()
                //Agarramos el stream de employees y generamos un mapa de caracteres
                .map(employee -> employee.getName().split(""))
                //Convertis en un stream de nuevo, usando el flatMap, para evitar que se haga un Stream<Stream<String>>
                .flatMap(Arrays::stream)
                //Generas del stream un mapa de caracteres en lowercase
                .map(String::toLowerCase)
                //Filtras por los caracteres que no sean espacios
                //(la diferencia entre map y filter es que a filter le pasas una condicion booleana, y al map una accion)
                .filter(string -> !(string.equals(" ")))
                //Lo convertis en una lista
                .collect(Collectors.toList());
        nameCharList.forEach(System.out::print);

        System.out.println();
        employeeList.stream().peek(System.out::println);
    }
}
