package streams;

import java.util.stream.IntStream;

public class NumericStreamExample {

    public static int sumOfSix()
    {
        return IntStream.rangeClosed(1,6).sum();
    }

    public static void main(String[] args) {
        System.out.println(sumOfSix());
    }
}
