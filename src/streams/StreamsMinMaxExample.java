package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static Optional<Integer> getMax(List<Integer> numbers) {
        return numbers.stream().reduce((i1, i2) -> i1>i2 ? i1 : i2);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,26,3,4,5);
        List<Integer> empty = new ArrayList<>();

        Optional<Integer> result = getMax(numbers);

        if(result.isPresent()) System.out.println(result.get());
    }
}
