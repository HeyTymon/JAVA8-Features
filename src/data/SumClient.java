package data;

import java.util.stream.IntStream;

public class SumClient {
    public static void main(String[] args) {

        Sum sum = new Sum();

        //IntStream.rangeClosed(0,1000).forEach(sum::sum);
        IntStream.rangeClosed(0,1000).parallel().forEach(sum::sum);

        System.out.println(sum.getTotal());
    }
}
