package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxing {

    public static List<Integer> boxing() {
        return IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());
    }

    public static int[] unboxing(List<Integer> integerList) {
        return integerList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(boxing());

        for(int i: unboxing(boxing()))
        {
            System.out.print(i + "  ");
        }
    }
}
