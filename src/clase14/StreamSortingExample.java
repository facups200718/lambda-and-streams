package clase14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamSortingExample {
    public static void main(String[] args) {
        List<Integer> dataContainer = Arrays.asList(105, 112, 95, 375, 303);
        System.out.println("Elements of the dataContainer before sorting: " + dataContainer);

        Collections.sort(dataContainer, ((o1, o2) -> (o1 > o2) ? -1 : ((o1 < o2) ? 1 : 0)));
        System.out.println("Elements of the dataContainer after being sorted: " + dataContainer);
    }
}
