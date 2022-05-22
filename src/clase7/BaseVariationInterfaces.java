package clase7;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;

public class BaseVariationInterfaces {
    public static void main(String[] args) {
        IntFunction<String> getDayOfWeek = dayNo -> {
            Map<Integer, String> days = new HashMap<>();
            days.put(1, "Sun");
            days.put(2, "Mon");
            days.put(3, "Tues");
            days.put(4, "Wed");
            days.put(5, "Thurs");
            days.put(6, "Fri");
            days.put(7, "Sat");

            return !days.get(dayNo).equals(null)
                    ? days.get(dayNo)
                    : "Value entered must be between 1 and 7";
        };

        Integer input = 1;
        String day = getDayOfWeek.apply(input);
        System.out.println("day No. " + input + " is: " + day);
        input = 6;
        System.out.println("day No. " + input + " is: " + getDayOfWeek.apply(input));
        input = -2;
        System.out.println("day No. " + input + " is: " + getDayOfWeek.apply(input));
        input = 9;
        System.out.println("day No. " + input + " is: " + getDayOfWeek.apply(input));
    }
}
