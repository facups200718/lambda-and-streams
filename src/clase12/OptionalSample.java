package clase12;

import java.util.Optional;

public class OptionalSample {
    public static void main(String[] args) {
        final Optional<String> middleName = getMiddleName();
        if (middleName.isEmpty())
            System.out.println("There's no middle name");
    }

    private static Optional<String> getMiddleName() {
        Optional<String> optional = Optional.of("p");
        //return Optional.empty();
        return optional;
    }
}
