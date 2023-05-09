package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsMatchExample {

    public static Boolean ones(List<Integer> numbers) {
        //return numbers.stream().anyMatch(i -> i ==1); //true
        //return numbers.stream().allMatch(i -> i ==1); //false
        return numbers.stream().noneMatch(i -> i ==3);  //true
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 1);

        System.out.println(ones(numbers));
    }
}
