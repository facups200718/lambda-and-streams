package clase15;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOps {
    public static void main(String[] args) {
        Stream<Customer> customerStream = Stream.of(
                new Customer("Alex", "regular"),
                new Customer("Cody", "premium"),
                new Customer("Gina", "regular"),
                new Customer("Alan", "premium")
                );

        //Agrupas por el customer type
        Map<String, List<Customer>> stringListMap = customerStream.collect(Collectors.groupingBy(Customer::getCustomerType));
        stringListMap.get("premium").forEach(c -> System.out.println(c.getCustomerName()));

        Stream<Customer> customerStream2 = Stream.of(
                new Customer("Alex", "regular"),
                new Customer("Cody", "premium"),
                new Customer("Gina", "regular"),
                new Customer("Alan", "premium")
        );

        //Fraccionando por tipo de customer regular
        Map<Boolean, List<Customer>> booleanListMap = customerStream2.collect(
                Collectors.partitioningBy(c -> "regular".equals(c.getCustomerType()))
        );
        booleanListMap.get(Boolean.TRUE).forEach(c -> System.out.println(c.getCustomerName()));

        //groupingBy toma en cuenta todos los customerTypes y los agrupa
        //partitioningBy pone como true a una lista de customers cuyo customerType es de un tipo,
        // y al resto de los customers (NO de los customerTypes) les pone FALSE
    }
}
