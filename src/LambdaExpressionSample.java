import java.util.*;

public class LambdaExpressionSample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(12);
        numbers.add(17);
        numbers.add(9);
        numbers.stream().sorted().forEach(
                number -> {
                    System.out.println(number);
                }
        );

        numbers.stream().sorted().forEach(System.out::println);
    }
}
